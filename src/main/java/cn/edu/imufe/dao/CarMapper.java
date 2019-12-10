package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Car;
import cn.edu.imufe.bean.CarExample;
import cn.edu.imufe.bean.vo.CarDetail;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMapper {
    int countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
    
    List<CarDetail> selectAllCarDetail();
    
    CarDetail selectCarDetailById(Integer id);
    
    CarDetail selectCarDetailByBrandId(Integer brandid);
    
    CarDetail selectCarDetailByCarTypeId(Integer cartypeid);
}