package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hospital")
public class HospitalBean implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    String HOSPITALNAME;
    String DAYTIME;
    String SATTIME;
    String HOLYTIME;
    String TELEPHONE;

    public HospitalBean() {
    }

    public HospitalBean(String HOSPITALNAME, String DAYTIME, String SATTIME, String HOLYTIME, String TELEPHONE) {
        this.HOSPITALNAME = HOSPITALNAME;
        this.DAYTIME = DAYTIME;
        this.SATTIME = SATTIME;
        this.HOLYTIME = HOLYTIME;
        this.TELEPHONE = TELEPHONE;
    }

    public String getHOSPITALNAME() {
        return this.HOSPITALNAME;
    }

    public void setHOSPITALNAME(String HOSPITALNAME) {
        this.HOSPITALNAME = HOSPITALNAME;
    }

    public String getDAYTIME() {
        return this.DAYTIME;
    }

    public void setDAYTIME(String DAYTIME) {
        this.DAYTIME = DAYTIME;
    }

    public String getSATTIME() {
        return this.SATTIME;
    }

    public void setSATTIME(String SATTIME) {
        this.SATTIME = SATTIME;
    }

    public String getHOLYTIME() {
        return this.HOLYTIME;
    }

    public void setHOLYTIME(String HOLYTIME) {
        this.HOLYTIME = HOLYTIME;
    }

    public String getTELEPHONE() {
        return this.TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public HospitalBean HOSPITALNAME(String HOSPITALNAME) {
        this.HOSPITALNAME = HOSPITALNAME;
        return this;
    }

    public HospitalBean DAYTIME(String DAYTIME) {
        this.DAYTIME = DAYTIME;
        return this;
    }

    public HospitalBean SATTIME(String SATTIME) {
        this.SATTIME = SATTIME;
        return this;
    }

    public HospitalBean HOLYTIME(String HOLYTIME) {
        this.HOLYTIME = HOLYTIME;
        return this;
    }

    public HospitalBean TELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HospitalBean)) {
            return false;
        }
        HospitalBean hospitalBean = (HospitalBean) o;
        return Objects.equals(HOSPITALNAME, hospitalBean.HOSPITALNAME) && Objects.equals(DAYTIME, hospitalBean.DAYTIME) && Objects.equals(SATTIME, hospitalBean.SATTIME) && Objects.equals(HOLYTIME, hospitalBean.HOLYTIME) && Objects.equals(TELEPHONE, hospitalBean.TELEPHONE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HOSPITALNAME, DAYTIME, SATTIME, HOLYTIME, TELEPHONE);
    }

    @Override
    public String toString() {
        return "{" +
            " HOSPITALNAME='" + getHOSPITALNAME() + "'" +
            ", DAYTIME='" + getDAYTIME() + "'" +
            ", SATTIME='" + getSATTIME() + "'" +
            ", HOLYTIME='" + getHOLYTIME() + "'" +
            ", TELEPHONE='" + getTELEPHONE() + "'" +
            "}";
    }

}