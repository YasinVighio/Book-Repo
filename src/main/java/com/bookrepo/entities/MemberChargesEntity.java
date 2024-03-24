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
@Table(name = "member_charges", schema = "library_mgmt", catalog = "")
public class MemberChargesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "member_charge_id", nullable = false)
    private Integer memberChargeId;
    @Basic
    @Column(name = "charge_type_id", nullable = false)
    private Integer chargeTypeId;
    @Basic
    @Column(name = "member_id", nullable = false)
    private Integer memberId;
    @Basic
    @Column(name = "member_charge_desc", nullable = true, length = 255)
    private String memberChargeDesc;

    public Integer getMemberChargeId() {
        return memberChargeId;
    }

    public void setMemberChargeId(Integer memberChargeId) {
        this.memberChargeId = memberChargeId;
    }

    public Integer getChargeTypeId() {
        return chargeTypeId;
    }

    public void setChargeTypeId(Integer chargeTypeId) {
        this.chargeTypeId = chargeTypeId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberChargeDesc() {
        return memberChargeDesc;
    }

    public void setMemberChargeDesc(String memberChargeDesc) {
        this.memberChargeDesc = memberChargeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberChargesEntity that = (MemberChargesEntity) o;
        return Objects.equals(memberChargeId, that.memberChargeId) && Objects.equals(chargeTypeId, that.chargeTypeId) && Objects.equals(memberId, that.memberId) && Objects.equals(memberChargeDesc, that.memberChargeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberChargeId, chargeTypeId, memberId, memberChargeDesc);
    }
}
