package com.bookrepo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "lending_books", schema = "library_mgmt", catalog = "")
public class LendingBooksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lending_book_id", nullable = false)
    private Integer lendingBookId;
    @Basic
    @Column(name = "book_lend_price", nullable = false)
    private Integer bookLendPrice;
    @Basic
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    public Integer getLendingBookId() {
        return lendingBookId;
    }

    public void setLendingBookId(Integer lendingBookId) {
        this.lendingBookId = lendingBookId;
    }

    public Integer getBookLendPrice() {
        return bookLendPrice;
    }

    public void setBookLendPrice(Integer bookLendPrice) {
        this.bookLendPrice = bookLendPrice;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LendingBooksEntity that = (LendingBooksEntity) o;
        return Objects.equals(lendingBookId, that.lendingBookId) && Objects.equals(bookLendPrice, that.bookLendPrice) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lendingBookId, bookLendPrice, bookId);
    }
}
