package cn.edu.imufe.bean;

public class Appearance {
    private Integer aid;

    private Integer carid;

    private String aurl;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getAurl() {
        return aurl;
    }

    public void setAurl(String aurl) {
        this.aurl = aurl == null ? null : aurl.trim();
    }
}