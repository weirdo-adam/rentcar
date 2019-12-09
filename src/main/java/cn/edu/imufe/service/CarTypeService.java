package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.CarType;

public interface CarTypeService {
       CarType selectById(int id);
       List<CarType> selectAll();
       boolean addCarType(CarType temp);
       boolean updateCarType(CarType temp);
}
