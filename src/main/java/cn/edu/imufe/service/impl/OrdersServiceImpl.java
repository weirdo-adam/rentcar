package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Orders;
import cn.edu.imufe.bean.vo.OrderDetail;
import cn.edu.imufe.dao.OrdersMapper;
import cn.edu.imufe.service.OrdersService;
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
	@Autowired OrdersMapper ordersDao;
	@Override
	public List<OrderDetail> selectAllOrderDetail() {
		List<OrderDetail> list=ordersDao.selectAllOrderDetail();
		return list;
	}

	@Override
	public OrderDetail selectOrderDetailById(int id) {
		OrderDetail temp=ordersDao.selectOrderDetailById(id);
		return temp;
	}

	@Override
	public boolean updateOrders(Orders temp) {
		int flag=ordersDao.updateByPrimaryKeySelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addOrders(Orders temp) {
		int flag=ordersDao.insertSelective(temp);
		if(flag>0) {
			return true;
		}
		return false;
	}

}
