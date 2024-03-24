package com.bookrepo.controllers;


import com.bookrepo.beans.responsebeans.BooksResponseBean;
import com.bookrepo.entities.BooksEntity;
import com.bookrepo.services.BooksService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/api/books/")
@RestController
@CrossOrigin
public class BookServiceController {

    @Autowired
    BooksService booksService;

    @GetMapping(value = "listBooks")
    public List<BooksResponseBean> getBooks(HttpSession session){
        return booksService.getAllBooks(session);
    }
}
