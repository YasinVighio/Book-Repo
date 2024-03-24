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
@Table(name = "sold_books", schema = "library_mgmt", catalog = "")
public class SoldBooksEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "transaction_id", nullable = false)
    private Integer transactionId;
    @Basic
    @Column(name = "selling_book_id", nullable = false)
    private Integer sellingBookId;
    @Basic
    @Column(name = "member_id", nullable = true)
    private Integer memberId;
    @Basic
    @Column(name = "buyer_name", nullable = true, length = 255)
    private String buyerName;
    @Basic
    @Column(name = "buyer_contact", nullable = true, length = 255)
    private String buyerContact;
    @Basic
    @Column(name = "date_sold", nullable = false)
    private Timestamp dateSold;
    @Basic
    @Column(name = "price_paid", nullable = false)
    private Integer pricePaid;
    @Basic
    @Column(name = "is_buyer_member", nullable = true)
    private Byte isBuyerMember;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getSellingBookId() {
        return sellingBookId;
    }

    public void setSellingBookId(Integer sellingBookId) {
        this.sellingBookId = sellingBookId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerContact() {
        return buyerContact;
    }

    public void setBuyerContact(String buyerContact) {
        this.buyerContact = buyerContact;
    }

    public Timestamp getDateSold() {
        return dateSold;
    }

    public void setDateSold(Timestamp dateSold) {
        this.dateSold = dateSold;
    }

    public Integer getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Integer pricePaid) {
        this.pricePaid = pricePaid;
    }

    public Byte getIsBuyerMember() {
        return isBuyerMember;
    }

    public void setIsBuyerMember(Byte isBuyerMember) {
        this.isBuyerMember = isBuyerMember;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoldBooksEntity that = (SoldBooksEntity) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(sellingBookId, that.sellingBookId) && Objects.equals(memberId, that.memberId) && Objects.equals(buyerName, that.buyerName) && Objects.equals(buyerContact, that.buyerContact) && Objects.equals(dateSold, that.dateSold) && Objects.equals(pricePaid, that.pricePaid) && Objects.equals(isBuyerMember, that.isBuyerMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, sellingBookId, memberId, buyerName, buyerContact, dateSold, pricePaid, isBuyerMember);
    }
}
