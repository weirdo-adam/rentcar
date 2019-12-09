package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Trim;
import cn.edu.imufe.bean.TrimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrimMapper {
    int countByExample(TrimExample example);

    int deleteByExample(TrimExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Trim record);

    int insertSelective(Trim record);

    List<Trim> selectByExample(TrimExample example);

    Trim selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Trim record, @Param("example") TrimExample example);

    int updateByExample(@Param("record") Trim record, @Param("example") TrimExample example);

    int updateByPrimaryKeySelective(Trim record);

    int updateByPrimaryKey(Trim record);
}