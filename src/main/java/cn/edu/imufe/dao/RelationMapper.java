package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Relation;
import cn.edu.imufe.bean.RelationExample;
import cn.edu.imufe.bean.vo.RelationDetail;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationMapper {
    int countByExample(RelationExample example);

    int deleteByExample(RelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Relation record);

    int insertSelective(Relation record);

    List<Relation> selectByExample(RelationExample example);

    Relation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
    
    List<RelationDetail> selectAllRelation(int locationid);
    
    RelationDetail selectRelationDetailById(Integer id);
    
    Relation selectByCarIdAndLocationId(@Param("carid") Integer carid, @Param("locationid") Integer locationid);

}