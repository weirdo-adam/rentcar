package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Brand;
import cn.edu.imufe.bean.BrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    int countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer brandid);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Integer brandid);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}