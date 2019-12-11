package cn.edu.imufe.bean.vo;

import java.util.List;

import cn.edu.imufe.bean.Appearance;
import cn.edu.imufe.bean.Space;
import cn.edu.imufe.bean.Trim;

public class CarDetailAndPhoto {
      private CarDetail carDetail;
      private List<Appearance> alist;
      private List<Trim> tlist;
      private List<Space> slist;
	public CarDetailAndPhoto() {
		super();
	}
	public CarDetail getCarDetail() {
		return carDetail;
	}
	public void setCarDetail(CarDetail CarDetail) {
		this.carDetail = CarDetail;
	}
	public List<Appearance> getAlist() {
		return alist;
	}
	public void setAlist(List<Appearance> alist) {
		this.alist = alist;
	}
	public List<Trim> getTlist() {
		return tlist;
	}
	public void setTlist(List<Trim> tlist) {
		this.tlist = tlist;
	}
	public List<Space> getSlist() {
		return slist;
	}
	public void setSlist(List<Space> slist) {
		this.slist = slist;
	}
      
      
}
