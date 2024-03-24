package com.bookrepo.beans.responsebeans;

import com.bookrepo.entities.BooksEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BooksResponseBean {
    private Integer isbn;
    private String bookName;
    private String authorName;
    private Integer quantityAvailable;
    private Boolean isEbookAvailable;

    public BooksResponseBean(BooksEntity book, Integer quantity){
        this.isbn = book.getIsbn();
        this.bookName = book.getBookName();
        this.quantityAvailable = quantity;
        this.authorName = book.getBookAuthor();
        this.isEbookAvailable = book.getIsEbookAvailable();
    }
}
