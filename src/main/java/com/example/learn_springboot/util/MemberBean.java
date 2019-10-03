package com.example.learn_springboot.util;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Member")
public class MemberBean implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    String ID;
    String PWD;
    String EMAIL;
    int TEL1;
    int TEL2;
    int TEL3;
    String NAME;
    String ADDRESS;
    String PETKINDS;
    int PETAGE;
    String NICKNAME;
    String RANK;
    int MILEAGE;
    int DAYYEAR;
    int DAYMONTH;
    int DAYDAY;
    String DAYCOMMENT;

    public MemberBean() {
    }

    public MemberBean(String ID, String PWD, String EMAIL, int TEL1, int TEL2, int TEL3, String NAME, String ADDRESS, String PETKINDS, int PETAGE, String NICKNAME, String RANK, int MILEAGE, int DAYYEAR, int DAYMONTH, int DAYDAY, String DAYCOMMENT) {
        this.ID = ID;
        this.PWD = PWD;
        this.EMAIL = EMAIL;
        this.TEL1 = TEL1;
        this.TEL2 = TEL2;
        this.TEL3 = TEL3;
        this.NAME = NAME;
        this.ADDRESS = ADDRESS;
        this.PETKINDS = PETKINDS;
        this.PETAGE = PETAGE;
        this.NICKNAME = NICKNAME;
        this.RANK = RANK;
        this.MILEAGE = MILEAGE;
        this.DAYYEAR = DAYYEAR;
        this.DAYMONTH = DAYMONTH;
        this.DAYDAY = DAYDAY;
        this.DAYCOMMENT = DAYCOMMENT;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPWD() {
        return this.PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getEMAIL() {
        return this.EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public int getTEL1() {
        return this.TEL1;
    }

    public void setTEL1(int TEL1) {
        this.TEL1 = TEL1;
    }

    public int getTEL2() {
        return this.TEL2;
    }

    public void setTEL2(int TEL2) {
        this.TEL2 = TEL2;
    }

    public int getTEL3() {
        return this.TEL3;
    }

    public void setTEL3(int TEL3) {
        this.TEL3 = TEL3;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getADDRESS() {
        return this.ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPETKINDS() {
        return this.PETKINDS;
    }

    public void setPETKINDS(String PETKINDS) {
        this.PETKINDS = PETKINDS;
    }

    public int getPETAGE() {
        return this.PETAGE;
    }

    public void setPETAGE(int PETAGE) {
        this.PETAGE = PETAGE;
    }

    public String getNICKNAME() {
        return this.NICKNAME;
    }

    public void setNICKNAME(String NICKNAME) {
        this.NICKNAME = NICKNAME;
    }

    public String getRANK() {
        return this.RANK;
    }

    public void setRANK(String RANK) {
        this.RANK = RANK;
    }

    public int getMILEAGE() {
        return this.MILEAGE;
    }

    public void setMILEAGE(int MILEAGE) {
        this.MILEAGE = MILEAGE;
    }

    public int getDAYYEAR() {
        return this.DAYYEAR;
    }

    public void setDAYYEAR(int DAYYEAR) {
        this.DAYYEAR = DAYYEAR;
    }

    public int getDAYMONTH() {
        return this.DAYMONTH;
    }

    public void setDAYMONTH(int DAYMONTH) {
        this.DAYMONTH = DAYMONTH;
    }

    public int getDAYDAY() {
        return this.DAYDAY;
    }

    public void setDAYDAY(int DAYDAY) {
        this.DAYDAY = DAYDAY;
    }

    public String getDAYCOMMENT() {
        return this.DAYCOMMENT;
    }

    public void setDAYCOMMENT(String DAYCOMMENT) {
        this.DAYCOMMENT = DAYCOMMENT;
    }

    public MemberBean ID(String ID) {
        this.ID = ID;
        return this;
    }

    public MemberBean PWD(String PWD) {
        this.PWD = PWD;
        return this;
    }

    public MemberBean EMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
        return this;
    }

    public MemberBean TEL1(int TEL1) {
        this.TEL1 = TEL1;
        return this;
    }

    public MemberBean TEL2(int TEL2) {
        this.TEL2 = TEL2;
        return this;
    }

    public MemberBean TEL3(int TEL3) {
        this.TEL3 = TEL3;
        return this;
    }

    public MemberBean NAME(String NAME) {
        this.NAME = NAME;
        return this;
    }

    public MemberBean ADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
        return this;
    }

    public MemberBean PETKINDS(String PETKINDS) {
        this.PETKINDS = PETKINDS;
        return this;
    }

    public MemberBean PETAGE(int PETAGE) {
        this.PETAGE = PETAGE;
        return this;
    }

    public MemberBean NICKNAME(String NICKNAME) {
        this.NICKNAME = NICKNAME;
        return this;
    }

    public MemberBean RANK(String RANK) {
        this.RANK = RANK;
        return this;
    }

    public MemberBean MILEAGE(int MILEAGE) {
        this.MILEAGE = MILEAGE;
        return this;
    }

    public MemberBean DAYYEAR(int DAYYEAR) {
        this.DAYYEAR = DAYYEAR;
        return this;
    }

    public MemberBean DAYMONTH(int DAYMONTH) {
        this.DAYMONTH = DAYMONTH;
        return this;
    }

    public MemberBean DAYDAY(int DAYDAY) {
        this.DAYDAY = DAYDAY;
        return this;
    }

    public MemberBean DAYCOMMENT(String DAYCOMMENT) {
        this.DAYCOMMENT = DAYCOMMENT;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MemberBean)) {
            return false;
        }
        MemberBean memberBean = (MemberBean) o;
        return Objects.equals(ID, memberBean.ID) && Objects.equals(PWD, memberBean.PWD) && Objects.equals(EMAIL, memberBean.EMAIL) && TEL1 == memberBean.TEL1 && TEL2 == memberBean.TEL2 && TEL3 == memberBean.TEL3 && Objects.equals(NAME, memberBean.NAME) && Objects.equals(ADDRESS, memberBean.ADDRESS) && Objects.equals(PETKINDS, memberBean.PETKINDS) && PETAGE == memberBean.PETAGE && Objects.equals(NICKNAME, memberBean.NICKNAME) && Objects.equals(RANK, memberBean.RANK) && MILEAGE == memberBean.MILEAGE && DAYYEAR == memberBean.DAYYEAR && DAYMONTH == memberBean.DAYMONTH && DAYDAY == memberBean.DAYDAY && Objects.equals(DAYCOMMENT, memberBean.DAYCOMMENT);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, PWD, EMAIL, TEL1, TEL2, TEL3, NAME, ADDRESS, PETKINDS, PETAGE, NICKNAME, RANK, MILEAGE, DAYYEAR, DAYMONTH, DAYDAY, DAYCOMMENT);
    }

    @Override
    public String toString() {
        return "{" +
            " ID='" + getID() + "'" +
            ", PWD='" + getPWD() + "'" +
            ", EMAIL='" + getEMAIL() + "'" +
            ", TEL1='" + getTEL1() + "'" +
            ", TEL2='" + getTEL2() + "'" +
            ", TEL3='" + getTEL3() + "'" +
            ", NAME='" + getNAME() + "'" +
            ", ADDRESS='" + getADDRESS() + "'" +
            ", PETKINDS='" + getPETKINDS() + "'" +
            ", PETAGE='" + getPETAGE() + "'" +
            ", NICKNAME='" + getNICKNAME() + "'" +
            ", RANK='" + getRANK() + "'" +
            ", MILEAGE='" + getMILEAGE() + "'" +
            ", DAYYEAR='" + getDAYYEAR() + "'" +
            ", DAYMONTH='" + getDAYMONTH() + "'" +
            ", DAYDAY='" + getDAYDAY() + "'" +
            ", DAYCOMMENT='" + getDAYCOMMENT() + "'" +
            "}";
    }

}