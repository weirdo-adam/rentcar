package cn.edu.imufe.dao;

import cn.edu.imufe.bean.Orders;
import cn.edu.imufe.bean.OrdersExample;
import cn.edu.imufe.bean.vo.OrderDetail;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    List<OrderDetail> selectAllOrderDetail();
    
    OrderDetail selectOrderDetailById(Integer oid);
    
    List<OrderDetail> selectAllOrderDetailByCId(Integer cid);
}