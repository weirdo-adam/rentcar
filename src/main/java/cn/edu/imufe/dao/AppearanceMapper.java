package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Appearance;
import cn.edu.imufe.bean.AppearanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppearanceMapper {
    int countByExample(AppearanceExample example);

    int deleteByExample(AppearanceExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Appearance record);

    int insertSelective(Appearance record);

    List<Appearance> selectByExample(AppearanceExample example);

    Appearance selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Appearance record, @Param("example") AppearanceExample example);

    int updateByExample(@Param("record") Appearance record, @Param("example") AppearanceExample example);

    int updateByPrimaryKeySelective(Appearance record);

    int updateByPrimaryKey(Appearance record);
    
    List<Appearance> selectByCarId(int carid);
}