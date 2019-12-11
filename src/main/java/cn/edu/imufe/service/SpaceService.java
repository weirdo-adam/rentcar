package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Space;

public interface SpaceService {
       boolean addSpace(Space temp);
       List<Space> selectByCarId(int carid);
}
