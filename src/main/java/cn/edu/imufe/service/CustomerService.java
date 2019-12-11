package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Customer;

public interface CustomerService {
       List<Customer> selectAll();
       Customer selectById(int id);
       boolean addCustomer(Customer temp);
       boolean updateCustomer(Customer temp);
       Customer selectByCname(String cname);
}
