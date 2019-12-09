package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Customer;
import cn.edu.imufe.dao.CustomerMapper;
import cn.edu.imufe.service.CustomerService;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired CustomerMapper customerDao;
	@Override
	public List<Customer> selectAll() {
		List<Customer> list=customerDao.selectByExample(null);
		return list;
	}

	@Override
	public Customer selectById(int id) {
		Customer temp=customerDao.selectByPrimaryKey(id);
		return temp;
	}

	@Override
	public boolean addCustomer(Customer temp) {
		int flag=customerDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCustomer(Customer temp) {
		int flag=customerDao.updateByPrimaryKeySelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

}
