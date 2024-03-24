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
@Table(name = "members", schema = "library_mgmt", catalog = "")
public class MembersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "member_id", nullable = false)
    private Integer memberId;
    @Basic
    @Column(name = "member_name", nullable = false, length = 255)
    private String memberName;
    @Basic
    @Column(name = "contact", nullable = false, length = 255)
    private String contact;
    @Basic
    @Column(name = "is_user", nullable = true)
    private Byte isUser;
    @Basic
    @Column(name = "is_active", nullable = true)
    private Byte isActive;
    @Basic
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Byte getIsUser() {
        return isUser;
    }

    public void setIsUser(Byte isUser) {
        this.isUser = isUser;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MembersEntity that = (MembersEntity) o;
        return Objects.equals(memberId, that.memberId) && Objects.equals(memberName, that.memberName) && Objects.equals(contact, that.contact) && Objects.equals(isUser, that.isUser) && Objects.equals(isActive, that.isActive) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName, contact, isUser, isActive, userId);
    }
}
