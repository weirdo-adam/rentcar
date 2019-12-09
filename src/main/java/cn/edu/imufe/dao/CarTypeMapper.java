package cn.edu.imufe.dao;

import cn.edu.imufe.bean.CarType;
import cn.edu.imufe.bean.CarTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarTypeMapper {
    int countByExample(CarTypeExample example);

    int deleteByExample(CarTypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(CarType record);

    int insertSelective(CarType record);

    List<CarType> selectByExample(CarTypeExample example);

    CarType selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByExample(@Param("record") CarType record, @Param("example") CarTypeExample example);

    int updateByPrimaryKeySelective(CarType record);

    int updateByPrimaryKey(CarType record);
}