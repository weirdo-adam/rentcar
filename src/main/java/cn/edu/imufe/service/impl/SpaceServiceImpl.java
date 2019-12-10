package cn.edu.imufe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Space;
import cn.edu.imufe.dao.SpaceMapper;
@Service("spaceService")
public class SpaceServiceImpl implements SpaceService {
	@Autowired SpaceMapper spaceDao;
	@Override
	public boolean addSpace(Space temp) {
		int flag=spaceDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

}
