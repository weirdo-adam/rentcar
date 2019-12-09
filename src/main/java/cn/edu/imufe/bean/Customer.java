package cn.edu.imufe.bean;

import java.util.Date;

public class Customer {
    private Integer cid;

    private String cname;

    private String cpassword;

    private String cusername;

    private String csex;

    private Integer cage;

    private String cphone;

    private String cemail;

    private Date ccreatetime;

    private Date cupdatetime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword == null ? null : cpassword.trim();
    }

    public String getCusername() {
        return cusername;
    }

    public void setCusername(String cusername) {
        this.cusername = cusername == null ? null : cusername.trim();
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex == null ? null : csex.trim();
    }

    public Integer getCage() {
        return cage;
    }

    public void setCage(Integer cage) {
        this.cage = cage;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone == null ? null : cphone.trim();
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail == null ? null : cemail.trim();
    }

    public Date getCcreatetime() {
        return ccreatetime;
    }

    public void setCcreatetime(Date ccreatetime) {
        this.ccreatetime = ccreatetime;
    }

    public Date getCupdatetime() {
        return cupdatetime;
    }

    public void setCupdatetime(Date cupdatetime) {
        this.cupdatetime = cupdatetime;
    }
}