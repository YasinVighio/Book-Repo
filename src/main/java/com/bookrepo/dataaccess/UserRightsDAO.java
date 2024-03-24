package com.bookrepo.dataaccess;

import com.bookrepo.entities.UserRightsEntity;
import com.bookrepo.repositories.UserRightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRightsDAO {

    @Autowired
    private UserRightsRepository userRightsRepository;
    public List<UserRightsEntity> getAllUserRights(){
       return userRightsRepository.findAll();
    }
}
