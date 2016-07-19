package com.decathlon.commerce.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by DengYuanqin on 7/18/2016.
 */

@Entity
@Table(name="epay.transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer transact_id;

    @Column(name="ORDER_ID", nullable=true)
    private String order_id;

    @Column(name="AC_ID", nullable=true)
    private Integer ac_id;

    @Column(name="TS_ID", nullable=true)
    private Integer ts_id;

    @Column(name="PMNT_ID", nullable=true)
    private Integer pmnt_id;

    @Column(name="EXTERNAL_ID", nullable=true)
    private String external_id;

    @Column(name="CT_ID", nullable=true)
    private Integer ct_id;

    @Column(name="TO_DELETE", nullable=true)
    private String to_delete;

    public Transaction() {
    }

    public Transaction(String order_id, Integer ac_id, Integer ts_id, Integer pmnt_id, String external_id, Integer ct_id, String to_delete) {
        this.order_id = order_id;
        this.ac_id = ac_id;
        this.ts_id = ts_id;
        this.pmnt_id = pmnt_id;
        this.external_id = external_id;
        this.ct_id = ct_id;
        this.to_delete = to_delete;
    }

    public Integer getTransact_id() {
        return transact_id;
    }

    public void setTransact_id(Integer transact_id) {
        this.transact_id = transact_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Integer getAc_id() {
        return ac_id;
    }

    public void setAc_id(Integer ac_id) {
        this.ac_id = ac_id;
    }

    public Integer getTs_id() {
        return ts_id;
    }

    public void setTs_id(Integer ts_id) {
        this.ts_id = ts_id;
    }

    public Integer getPmnt_id() {
        return pmnt_id;
    }

    public void setPmnt_id(Integer pmnt_id) {
        this.pmnt_id = pmnt_id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public Integer getCt_id() {
        return ct_id;
    }

    public void setCt_id(Integer ct_id) {
        this.ct_id = ct_id;
    }

    public String getTo_delete() {
        return to_delete;
    }

    public void setTo_delete(String to_delete) {
        this.to_delete = to_delete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;

        Transaction that = (Transaction) o;

        if (getTransact_id() != null ? !getTransact_id().equals(that.getTransact_id()) : that.getTransact_id() != null)
            return false;
        if (getOrder_id() != null ? !getOrder_id().equals(that.getOrder_id()) : that.getOrder_id() != null)
            return false;
        if (getAc_id() != null ? !getAc_id().equals(that.getAc_id()) : that.getAc_id() != null) return false;
        if (getTs_id() != null ? !getTs_id().equals(that.getTs_id()) : that.getTs_id() != null) return false;
        if (getPmnt_id() != null ? !getPmnt_id().equals(that.getPmnt_id()) : that.getPmnt_id() != null) return false;
        if (getExternal_id() != null ? !getExternal_id().equals(that.getExternal_id()) : that.getExternal_id() != null)
            return false;
        if (getCt_id() != null ? !getCt_id().equals(that.getCt_id()) : that.getCt_id() != null) return false;
        return getTo_delete() != null ? getTo_delete().equals(that.getTo_delete()) : that.getTo_delete() == null;

    }

    @Override
    public int hashCode() {
        int result = getTransact_id() != null ? getTransact_id().hashCode() : 0;
        result = 31 * result + (getOrder_id() != null ? getOrder_id().hashCode() : 0);
        result = 31 * result + (getAc_id() != null ? getAc_id().hashCode() : 0);
        result = 31 * result + (getTs_id() != null ? getTs_id().hashCode() : 0);
        result = 31 * result + (getPmnt_id() != null ? getPmnt_id().hashCode() : 0);
        result = 31 * result + (getExternal_id() != null ? getExternal_id().hashCode() : 0);
        result = 31 * result + (getCt_id() != null ? getCt_id().hashCode() : 0);
        result = 31 * result + (getTo_delete() != null ? getTo_delete().hashCode() : 0);
        return result;
    }
}
