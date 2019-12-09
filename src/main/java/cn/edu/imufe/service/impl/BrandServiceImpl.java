package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Brand;
import cn.edu.imufe.dao.BrandMapper;
import cn.edu.imufe.service.BrandService;
@Service("brandService")
public class BrandServiceImpl implements BrandService {
	@Autowired BrandMapper brandDao;
	@Override
	public Brand selectById(int id) {
		Brand temp=brandDao.selectByPrimaryKey(id);
		return temp;
	}

	@Override
	public List<Brand> selectAll() {
		List<Brand> list=brandDao.selectByExample(null);
		return list;
	}

	@Override
	public boolean addBrand(Brand temp) {
		int flag=brandDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBrand(Brand temp) {
		int flag=brandDao.updateByPrimaryKeySelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

}
