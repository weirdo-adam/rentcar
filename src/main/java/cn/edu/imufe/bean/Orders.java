package cn.edu.imufe.bean;

import java.util.Date;

public class Orders {
    private Integer oid;

    private Integer cid;

    private Integer carid;

    private Date starttime;

    private Date endtime;

    private Integer pricecnt;

    private Integer extractuid;

    private String extractlocation;

    private Date extractdate;

    private Integer stilluid;

    private String stilllocation;

    private Date stilldate;

    private String state;

    private String remarks;

    private Date createtime;

    private Date updatetime;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getPricecnt() {
        return pricecnt;
    }

    public void setPricecnt(Integer pricecnt) {
        this.pricecnt = pricecnt;
    }

    public Integer getExtractuid() {
        return extractuid;
    }

    public void setExtractuid(Integer extractuid) {
        this.extractuid = extractuid;
    }

    public String getExtractlocation() {
        return extractlocation;
    }

    public void setExtractlocation(String extractlocation) {
        this.extractlocation = extractlocation == null ? null : extractlocation.trim();
    }

    public Date getExtractdate() {
        return extractdate;
    }

    public void setExtractdate(Date extractdate) {
        this.extractdate = extractdate;
    }

    public Integer getStilluid() {
        return stilluid;
    }

    public void setStilluid(Integer stilluid) {
        this.stilluid = stilluid;
    }

    public String getStilllocation() {
        return stilllocation;
    }

    public void setStilllocation(String stilllocation) {
        this.stilllocation = stilllocation == null ? null : stilllocation.trim();
    }

    public Date getStilldate() {
        return stilldate;
    }

    public void setStilldate(Date stilldate) {
        this.stilldate = stilldate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}