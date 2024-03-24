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
@Table(name = "rules", schema = "library_mgmt", catalog = "")
public class RulesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rule_id", nullable = false)
    private Integer ruleId;
    @Basic
    @Column(name = "rule_desc", nullable = false, length = 255)
    private String ruleDesc;
    @Basic
    @Column(name = "is_active", nullable = true)
    private Byte isActive;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
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
        RulesEntity that = (RulesEntity) o;
        return Objects.equals(ruleId, that.ruleId) && Objects.equals(ruleDesc, that.ruleDesc) && Objects.equals(isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, ruleDesc, isActive);
    }
}
