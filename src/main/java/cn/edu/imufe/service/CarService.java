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
      List<CarDetail> selectCarDetailByBrandId(int brandid);
      List<CarDetail> selectCarDetailByCarTypeId(int typeid);
      List<CarDetail> selectCarDetailByLocationId(int locationid);
      List<CarDetail> selectAllCarDetailMoreSeatCnt(int cnt);
      List<CarDetail> selectAllCarDetailLessSeatCnt(int cnt);
}
