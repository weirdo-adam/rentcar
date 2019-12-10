package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Car;
import cn.edu.imufe.bean.vo.CarDetail;

public interface CarService {
      List<Car> selectAll();
      List<CarDetail> selectAllCarDetail();
      CarDetail selectCarDetailById(int id);
      boolean addCar(Car temp);
      boolean updateCar(Car temp);
      CarDetail selectCarDetailByBrandId(int brandid);
      CarDetail selectCarDetailByCarTypeId(int typeid);
}
