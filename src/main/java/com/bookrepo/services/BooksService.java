package com.bookrepo.services;

import com.bookrepo.beans.responsebeans.BooksResponseBean;
import com.bookrepo.dataaccess.BooksDAO;
import com.bookrepo.dataaccess.BooksInventoryDAO;
import com.bookrepo.entities.BooksEntity;
import com.bookrepo.exceptions.UnAuthException;
import com.bookrepo.utility.CommonUtilities;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooksService {

    @Autowired
    protected BooksDAO booksDAO;

    @Autowired
    protected BooksInventoryDAO booksInventoryDAO;

    public List<BooksResponseBean> getAllBooks(HttpSession session) throws UnAuthException {
        CommonUtilities.validateUserSession(session);
        List<BooksEntity> books = booksDAO.getAllBooks();


        List<BooksResponseBean> responseBeans = books.stream()
                .map(booksEntity ->
                        new BooksResponseBean(booksEntity,
                                booksEntity.getIsAvailable() ?
                                        booksInventoryDAO.getBookQuantityByBookId(booksEntity.getBookId()) : 0))
                .collect(Collectors.toList());


        return responseBeans;
    }
}