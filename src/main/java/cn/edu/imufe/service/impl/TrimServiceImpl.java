package cn.edu.imufe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Trim;
import cn.edu.imufe.dao.TrimMapper;
import cn.edu.imufe.service.TrimService;
@Service("trimService")
public class TrimServiceImpl implements TrimService {
	@Autowired TrimMapper trimDao;
	@Override
	public boolean addTrim(Trim temp) {
		int flag=trimDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

}
