package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.CarType;
import cn.edu.imufe.dao.CarTypeMapper;
import cn.edu.imufe.service.CarTypeService;
@Service("carTypeService")
public class CarTypeServiceImpl implements CarTypeService {
	@Autowired CarTypeMapper carTypeDao;
	@Override
	public CarType selectById(int id) {
		CarType temp=carTypeDao.selectByPrimaryKey(id);
		return temp;
	}

	@Override
	public List<CarType> selectAll() {
		List<CarType> list=carTypeDao.selectByExample(null);
		return list;
	}

	@Override
	public boolean addCarType(CarType temp) {
		int flag=carTypeDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCarType(CarType temp) {
		int flag=carTypeDao.updateByPrimaryKeySelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

}
