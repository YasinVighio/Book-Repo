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
@Table(name = "charge_types", schema = "library_mgmt", catalog = "")
public class ChargeTypesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "charge_type_id", nullable = false)
    private Integer chargeTypeId;
    @Basic
    @Column(name = "charge_desc", nullable = false, length = 255)
    private String chargeDesc;
    @Basic
    @Column(name = "is_active", nullable = true)
    private Byte isActive;

    public Integer getChargeTypeId() {
        return chargeTypeId;
    }

    public void setChargeTypeId(Integer chargeTypeId) {
        this.chargeTypeId = chargeTypeId;
    }

    public String getChargeDesc() {
        return chargeDesc;
    }

    public void setChargeDesc(String chargeDesc) {
        this.chargeDesc = chargeDesc;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChargeTypesEntity that = (ChargeTypesEntity) o;
        return Objects.equals(chargeTypeId, that.chargeTypeId) && Objects.equals(chargeDesc, that.chargeDesc) && Objects.equals(isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargeTypeId, chargeDesc, isActive);
    }
}
