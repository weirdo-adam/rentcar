package cn.edu.imufe.bean.vo;
/**
 * 
 * @author lpf
 * 办事处车辆关系类
 */
public class RelationDetail {
	 private Integer id;

	 private Integer locationid;

	 private Integer carid;

	 private Integer cnt;
	    
	 private String locationname;
	    
	 private String carname;

	public RelationDetail() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	public Integer getCarid() {
		return carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public String getLocationname() {
		return locationname;
	}

	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}
	 
	 
}
