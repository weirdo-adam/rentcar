package cn.edu.imufe.bean;

import java.util.Date;

public class Car {
    private Integer id;

    private Integer cartypeid;

    private String name;

    private Integer brandid;

    private Integer hot;

    private Integer seatcnt;

    private String gear;

    private Integer trunkcnt;

    private Integer ridecnt;

    private Integer price;

    private Integer surplusnum;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCartypeid() {
        return cartypeid;
    }

    public void setCartypeid(Integer cartypeid) {
        this.cartypeid = cartypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Integer getSeatcnt() {
        return seatcnt;
    }

    public void setSeatcnt(Integer seatcnt) {
        this.seatcnt = seatcnt;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear == null ? null : gear.trim();
    }

    public Integer getTrunkcnt() {
        return trunkcnt;
    }

    public void setTrunkcnt(Integer trunkcnt) {
        this.trunkcnt = trunkcnt;
    }

    public Integer getRidecnt() {
        return ridecnt;
    }

    public void setRidecnt(Integer ridecnt) {
        this.ridecnt = ridecnt;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSurplusnum() {
        return surplusnum;
    }

    public void setSurplusnum(Integer surplusnum) {
        this.surplusnum = surplusnum;
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