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
@Table(name = "user_role_rights", schema = "library_mgmt", catalog = "")
public class UserRoleRightsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_role_right_id", nullable = false)
    private Integer userRoleRightId;
    @Basic
    @Column(name = "right_id", nullable = false)
    private Integer rightId;
    @Basic
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    public Integer getUserRoleRightId() {
        return userRoleRightId;
    }

    public void setUserRoleRightId(Integer userRoleRightId) {
        this.userRoleRightId = userRoleRightId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleRightsEntity that = (UserRoleRightsEntity) o;
        return Objects.equals(userRoleRightId, that.userRoleRightId) && Objects.equals(rightId, that.rightId) && Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userRoleRightId, rightId, roleId);
    }
}
