package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Location;
import cn.edu.imufe.bean.LocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationMapper {
    int countByExample(LocationExample example);

    int deleteByExample(LocationExample example);

    int deleteByPrimaryKey(Integer locationid);

    int insert(Location record);

    int insertSelective(Location record);

    List<Location> selectByExample(LocationExample example);

    Location selectByPrimaryKey(Integer locationid);

    int updateByExampleSelective(@Param("record") Location record, @Param("example") LocationExample example);

    int updateByExample(@Param("record") Location record, @Param("example") LocationExample example);

    int updateByPrimaryKeySelective(Location record);

    int updateByPrimaryKey(Location record);
}