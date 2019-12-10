package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Relation;
import cn.edu.imufe.bean.vo.RelationDetail;
import cn.edu.imufe.dao.RelationMapper;
import cn.edu.imufe.service.RelationService;
@Service("relationService")
public class RelationServiceImpl implements RelationService {
	@Autowired RelationMapper relationDao;
	@Override
	public List<RelationDetail> selectAllRealtionDetail(int id) {
		List<RelationDetail> list=relationDao.selectAllRelation(id);
		return list;
	}

	@Override
	public RelationDetail selectRelationDetailById(int id) {
		RelationDetail temp=relationDao.selectRelationDetailById(id);
		return temp;
	}

	@Override
	public boolean addRelation(Relation temp) {
		int flag=relationDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateRelation(Relation temp) {
		int flag=relationDao.updateByPrimaryKeySelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

	@Override
	public Relation selectByCarIdAndLocationId(int carid, int locationid) {
		Relation temp=relationDao.selectByCarIdAndLocationId(carid, locationid);
		return temp;
	}

}
