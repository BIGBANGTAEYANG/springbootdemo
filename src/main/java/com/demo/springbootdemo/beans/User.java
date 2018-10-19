package com.demo.springbootdemo.beans;

import java.sql.Date;

public class User {
    private Integer ID;
    private String USER_NAME;
    private String USER_PASSWORD;
    private String NIKE_NAME;
    private Integer STATUS;
    private String EMAIL;
    private Date PASSWORD_END_DATE;
    private Date USER_START_DATE;
    private Date USER_END_DATE;
    private String IPS;
    private Integer ORG_ID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public void setUSER_PASSWORD(String USER_PASSWORD) {
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public String getNIKE_NAME() {
        return NIKE_NAME;
    }

    public void setNIKE_NAME(String NIKE_NAME) {
        this.NIKE_NAME = NIKE_NAME;
    }

    public Integer getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Integer STATUS) {
        this.STATUS = STATUS;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public Date getPASSWORD_END_DATE() {
        return PASSWORD_END_DATE;
    }

    public void setPASSWORD_END_DATE(Date PASSWORD_END_DATE) {
        this.PASSWORD_END_DATE = PASSWORD_END_DATE;
    }

    public Date getUSER_START_DATE() {
        return USER_START_DATE;
    }

    public void setUSER_START_DATE(Date USER_START_DATE) {
        this.USER_START_DATE = USER_START_DATE;
    }

    public Date getUSER_END_DATE() {
        return USER_END_DATE;
    }

    public void setUSER_END_DATE(Date USER_END_DATE) {
        this.USER_END_DATE = USER_END_DATE;
    }

    public String getIPS() {
        return IPS;
    }

    public void setIPS(String IPS) {
        this.IPS = IPS;
    }

    public Integer getORG_ID() {
        return ORG_ID;
    }

    public void setORG_ID(Integer ORG_ID) {
        this.ORG_ID = ORG_ID;
    }
}
