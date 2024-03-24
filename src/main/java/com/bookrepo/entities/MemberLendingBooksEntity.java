package com.bookrepo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member_lending_books", schema = "library_mgmt", catalog = "")
public class MemberLendingBooksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "transaction_id", nullable = false)
    private Integer transactionId;
    @Basic
    @Column(name = "member_id", nullable = false)
    private Integer memberId;
    @Basic
    @Column(name = "lending_book_id", nullable = false)
    private Integer lendingBookId;
    @Basic
    @Column(name = "date_lended", nullable = false)
    private Timestamp dateLended;
    @Basic
    @Column(name = "date_returned", nullable = true)
    private Timestamp dateReturned;
    @Basic
    @Column(name = "returning_date", nullable = false)
    private Timestamp returningDate;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getLendingBookId() {
        return lendingBookId;
    }

    public void setLendingBookId(Integer lendingBookId) {
        this.lendingBookId = lendingBookId;
    }

    public Timestamp getDateLended() {
        return dateLended;
    }

    public void setDateLended(Timestamp dateLended) {
        this.dateLended = dateLended;
    }

    public Timestamp getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Timestamp dateReturned) {
        this.dateReturned = dateReturned;
    }

    public Timestamp getReturningDate() {
        return returningDate;
    }

    public void setReturningDate(Timestamp returningDate) {
        this.returningDate = returningDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberLendingBooksEntity that = (MemberLendingBooksEntity) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(memberId, that.memberId) && Objects.equals(lendingBookId, that.lendingBookId) && Objects.equals(dateLended, that.dateLended) && Objects.equals(dateReturned, that.dateReturned) && Objects.equals(returningDate, that.returningDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, memberId, lendingBookId, dateLended, dateReturned, returningDate);
    }
}
