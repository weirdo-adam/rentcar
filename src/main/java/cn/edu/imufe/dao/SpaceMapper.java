package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Space;
import cn.edu.imufe.bean.SpaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceMapper {
    int countByExample(SpaceExample example);

    int deleteByExample(SpaceExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Space record);

    int insertSelective(Space record);

    List<Space> selectByExample(SpaceExample example);

    Space selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Space record, @Param("example") SpaceExample example);

    int updateByExample(@Param("record") Space record, @Param("example") SpaceExample example);

    int updateByPrimaryKeySelective(Space record);

    int updateByPrimaryKey(Space record);
}