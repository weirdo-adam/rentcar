package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Orders;
import cn.edu.imufe.bean.vo.OrderDetail;

public interface OrdersService {
       List<OrderDetail> selectAllOrderDetail();
       OrderDetail selectOrderDetailById(int id);
       boolean updateOrders(Orders temp);
       boolean addOrders(Orders temp);
       List<OrderDetail> selectAllOrderDetailByCId(int cid);
} 
