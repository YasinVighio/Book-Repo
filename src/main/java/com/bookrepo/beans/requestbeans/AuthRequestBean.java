package com.bookrepo.beans.requestbeans;

import lombok.Data;

@Data
public class AuthRequestBean {
    private String username;
    private String password;
    private String userType;
}
