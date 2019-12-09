package cn.edu.imufe.bean;

public class Space {
    private Integer sid;

    private Integer carid;

    private String surl;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl == null ? null : surl.trim();
    }
}