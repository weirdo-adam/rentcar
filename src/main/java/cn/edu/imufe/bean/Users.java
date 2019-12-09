package cn.edu.imufe.bean;

import java.util.Date;

public class Users {
    private Integer uid;

    private String uname;

    private Integer upower;

    private String upassword;

    private Date ucreatetime;

    private Date uupatetime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUpower() {
        return upower;
    }

    public void setUpower(Integer upower) {
        this.upower = upower;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Date getUcreatetime() {
        return ucreatetime;
    }

    public void setUcreatetime(Date ucreatetime) {
        this.ucreatetime = ucreatetime;
    }

    public Date getUupatetime() {
        return uupatetime;
    }

    public void setUupatetime(Date uupatetime) {
        this.uupatetime = uupatetime;
    }
}