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
@Table(name = "books_inventory", schema = "library_mgmt", catalog = "")
public class BooksInventoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "book_inventory_id", nullable = false)
    private Integer bookInventoryId;
    @Basic
    @Column(name = "book_id", nullable = false)
    private Integer bookId;
    @Basic
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    public Integer getBookInventoryId() {
        return bookInventoryId;
    }

    public void setBookInventoryId(Integer bookInventoryId) {
        this.bookInventoryId = bookInventoryId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooksInventoryEntity that = (BooksInventoryEntity) o;
        return Objects.equals(bookInventoryId, that.bookInventoryId) && Objects.equals(bookId, that.bookId) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookInventoryId, bookId, quantity);
    }
}
