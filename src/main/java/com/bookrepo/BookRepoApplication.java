package com.bookrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookRepoApplication {

    public static void main(String[] args) {
//        String salt = UserUtility.getSalt();
//        System.out.println(salt);
//        System.out.println(UserUtility.encryptUserPassword("test", salt));

        SpringApplication.run(BookRepoApplication.class, args);
    }

}
