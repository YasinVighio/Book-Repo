package com.bookrepo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users", schema = "library_mgmt", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)

    private Integer userId;
    @Column(name = "username", nullable = false, length = 255)
    private String username;
    @Column(name = "contact", nullable = false, length = 255)
    private String contact;
    @Column(name = "pwd", nullable = false, length = 255)
    private String pwd;
    @Column(name = "salt", nullable = false, length = 255)
    private String salt;
    @Column(name = "is_active", nullable = true)
    private Byte isActive;
    @Column(name = "role_id", nullable = false)
    private Integer roleId;
}
