package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Car;
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

}
