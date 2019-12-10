package cn.edu.imufe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Appearance;
import cn.edu.imufe.dao.AppearanceMapper;
import cn.edu.imufe.service.AppearanceService;
@Service("appearanceService")
public class AppearanceServiceImpl implements AppearanceService {
	@Autowired AppearanceMapper appearanceDao;


	@Override
	public boolean addAppearance(Appearance temp) {
		int flag=appearanceDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}


	
}
