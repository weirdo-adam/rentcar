package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Brand;

public interface BrandService {
       Brand selectById(int id);
       List<Brand> selectAll();
       boolean addBrand(Brand temp);
       boolean updateBrand(Brand temp);
}
