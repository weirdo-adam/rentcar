package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Location;
import cn.edu.imufe.dao.LocationMapper;
import cn.edu.imufe.service.LocationService;
@Service("locationService")
public class LocationServiceImpl implements LocationService{
	@Autowired LocationMapper locationDao;
	@Override
	public Location selectById(int id) {
		Location temp=locationDao.selectByPrimaryKey(id);
		return temp;
	}

	@Override
	public List<Location> selectAll() {
		List<Location> list=locationDao.selectByExample(null);
		return list;
	}

	@Override
	public boolean addLocation(Location temp) {
		int flag=locationDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateById(Location temp) {
		int flag=locationDao.updateByPrimaryKeySelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

}
