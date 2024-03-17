package com.bookrepo.controllers;

import com.bookrepo.entities.UserRightsEntity;
import com.bookrepo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/users/")
@RestController
public class UserServiceController {

    @Autowired
    private UserService userService;

    @GetMapping(value="getUserRights")
    public List<UserRightsEntity> listUserRights(){
        return userService.getAllUserRights();
    }
}
