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
@Table(name = "selling_books", schema = "library_mgmt", catalog = "")
public class SellingBooksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "selling_book_id", nullable = false)
    private Integer sellingBookId;
    @Basic
    @Column(name = "book_id", nullable = false)
    private Integer bookId;
    @Basic
    @Column(name = "sell_price", nullable = false)
    private Integer sellPrice;

    public Integer getSellingBookId() {
        return sellingBookId;
    }

    public void setSellingBookId(Integer sellingBookId) {
        this.sellingBookId = sellingBookId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellingBooksEntity that = (SellingBooksEntity) o;
        return Objects.equals(sellingBookId, that.sellingBookId) && Objects.equals(bookId, that.bookId) && Objects.equals(sellPrice, that.sellPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sellingBookId, bookId, sellPrice);
    }
}
