package com.bookrepo.controllers;

import com.bookrepo.beans.requestbeans.AuthRequestBean;
import com.bookrepo.entities.UserRightsEntity;
import com.bookrepo.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/users/")
@RestController
@CrossOrigin
public class UserServiceController {

    @Autowired
    private UserService userService;

    @GetMapping(value="getUserRights")
    public List<UserRightsEntity> listUserRights(HttpSession session){
        return userService.getAllUserRights(session);
    }

    @PostMapping(value="authorizeUser")
    public Boolean authorizeUser(@RequestBody AuthRequestBean authRequestBean, HttpSession session){
        return userService.authorizeUser(authRequestBean, session);
    }
}
