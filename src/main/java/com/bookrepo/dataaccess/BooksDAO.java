package com.bookrepo.dataaccess;


import com.bookrepo.entities.BooksEntity;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BooksDAO {

    @Autowired
    private EntityManager entityManager;
    public List<BooksEntity> getAllBooks(){
        List<BooksEntity> resultSet = null;
        try{
            Session hibernateSession = entityManager.unwrap(Session.class);
            Query query = hibernateSession.createQuery("FROM BooksEntity");
            resultSet = query.list();
        } catch (Exception e){
            System.out.println("Dataaccess exception: " + e.getMessage());
        } finally {
            return resultSet;
        }
    }
}
