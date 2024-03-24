package com.bookrepo.dataaccess;

import com.bookrepo.entities.UsersEntity;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class UsersDAO {

    @Autowired
    private EntityManager entityManager;
    public UsersEntity getUserByUsername(String username){
        UsersEntity user = null;
        try{
            Session session = entityManager.unwrap(Session.class);
            Query query = session.createQuery("FROM UsersEntity WHERE username = :uname");
            query.setParameter("uname", username);
            user = (UsersEntity) query.uniqueResult();
        } catch (Exception e){
            System.out.println("Dataaccess exception: " + e.getMessage());
        } finally {
            return user;
        }
    }
}
