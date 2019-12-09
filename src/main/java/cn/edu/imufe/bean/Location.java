package cn.edu.imufe.bean;

public class Location {
    private Integer locationid;

    private String locationname;

    public Integer getLocationid() {
        return locationid;
    }

    public void setLocationid(Integer locationid) {
        this.locationid = locationid;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname == null ? null : locationname.trim();
    }
}