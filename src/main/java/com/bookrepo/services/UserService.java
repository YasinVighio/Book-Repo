package com.bookrepo.services;

import com.bookrepo.entities.UserRightsEntity;
import com.bookrepo.persistence.UserRightsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRightsDAO userRightsDAO;

    public List<UserRightsEntity> getAllUserRights(){
        return userRightsDAO.getAllUserRights();
    }
}
