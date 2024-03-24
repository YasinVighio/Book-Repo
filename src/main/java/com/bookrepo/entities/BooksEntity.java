package com.bookrepo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
@Table(name = "books", schema = "library_mgmt", catalog = "")
public class BooksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "book_id", nullable = false)
    private Integer bookId;
    @Basic
    @Column(name = "isbn", nullable = false)
    private Integer isbn;
    @Basic
    @Column(name = "book_name", nullable = true, length = 255)
    private String bookName;
    @Basic
    @Column(name = "book_author", nullable = true, length = 255)
    private String bookAuthor;
    @Basic
    @Column(name = "is_available", nullable = true)
    private Boolean isAvailable;
    @Basic
    @Column(name = "is_ebook_available", nullable = true)
    private Boolean isEbookAvailable;

}
