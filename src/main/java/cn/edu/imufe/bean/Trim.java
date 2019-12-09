package cn.edu.imufe.bean;

public class Trim {
    private Integer tid;

    private Integer carid;

    private String turl;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl == null ? null : turl.trim();
    }
}