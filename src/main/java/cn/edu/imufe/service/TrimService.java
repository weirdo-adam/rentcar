package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Trim;

public interface TrimService {
       boolean addTrim(Trim temp);
       List<Trim> selectByCarId(int carid);
 }
