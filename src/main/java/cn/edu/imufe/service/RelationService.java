package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Relation;
import cn.edu.imufe.bean.vo.RelationDetail;

public interface RelationService {
       List<RelationDetail> selectAllRealtionDetail(int id);
       RelationDetail selectRelationDetailById(int id);
       boolean addRelation(Relation temp);
       boolean updateRelation(Relation temp);
}
