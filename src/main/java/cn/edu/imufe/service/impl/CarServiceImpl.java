package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Car;
import cn.edu.imufe.bean.vo.CarDetail;
import cn.edu.imufe.dao.CarMapper;
import cn.edu.imufe.service.CarService;
@Service("carService")
public class CarServiceImpl implements CarService {
	@Autowired CarMapper carDao;
	@Override
	public List<Car> selectAll() {
		List<Car> list=carDao.selectByExample(null);
		return list;
	}
	@Override
	public List<CarDetail> selectAllCarDetail() {
		List<CarDetail> list=carDao.selectAllCarDetail();
		return list;
	}
	@Override
	public CarDetail selectCarDetailById(int id) {
		CarDetail temp=carDao.selectCarDetailById(id);
		return temp;
	}
	@Override
	public boolean addCar(Car temp) {
		int flag=carDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}
	@Override
	public boolean updateCar(Car temp) {
		int flag=carDao.updateByPrimaryKeySelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}
	@Override
	public CarDetail selectCarDetailByBrandId(int brandid) {
		CarDetail temp=carDao.selectCarDetailByBrandId(brandid);
		return temp;
	}
	@Override
	public CarDetail selectCarDetailByCarTypeId(int typeid) {
		CarDetail temp=carDao.selectCarDetailByCarTypeId(typeid);
		return temp;
	}

}
