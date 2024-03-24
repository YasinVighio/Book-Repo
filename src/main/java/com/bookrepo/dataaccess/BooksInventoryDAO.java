package com.bookrepo.dataaccess;


import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BooksInventoryDAO {

    @Autowired
    EntityManager entityManager;
    public Integer getBookQuantityByBookId(Integer bookId){
        Integer qty = 0;
        try{
            Session session = entityManager.unwrap(Session.class);
            Query query = session.createQuery("SELECT quantity FROM BooksInventoryEntity where bookId= :bookId");
            query.setParameter("bookId", bookId);
            qty = (Integer) query.uniqueResult();
        }catch (Exception e){
            System.out.println("Dataaccess exception: " + e.getMessage());
        } finally {
            return qty;
        }
    }
}
