package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Appearance;

public interface AppearanceService {
       boolean addAppearance(Appearance temp);
       List<Appearance> selectByCarId(int carid);
}
