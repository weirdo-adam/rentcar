package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Location;

public interface LocationService {
      Location selectById(int id);
      List<Location> selectAll();
      boolean addLocation(Location temp);
      boolean updateById(Location temp);
}
