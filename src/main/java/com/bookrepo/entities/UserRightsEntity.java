package com.bookrepo.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_rights", schema = "library_mgmt", catalog = "")
public class UserRightsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "right_id", nullable = false)
    private Integer rightId;
    @Basic
    @Column(name = "right_name", nullable = false, length = 255)
    private String rightName;
    @Basic
    @Column(name = "right_desc", nullable = true, length = 255)
    private String rightDesc;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRightsEntity that = (UserRightsEntity) o;

        if (rightId != null ? !rightId.equals(that.rightId) : that.rightId != null) return false;
        if (rightName != null ? !rightName.equals(that.rightName) : that.rightName != null) return false;
        if (rightDesc != null ? !rightDesc.equals(that.rightDesc) : that.rightDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rightId != null ? rightId.hashCode() : 0;
        result = 31 * result + (rightName != null ? rightName.hashCode() : 0);
        result = 31 * result + (rightDesc != null ? rightDesc.hashCode() : 0);
        return result;
    }
}
