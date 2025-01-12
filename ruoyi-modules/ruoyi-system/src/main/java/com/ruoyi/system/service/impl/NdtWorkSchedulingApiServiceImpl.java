package com.ruoyi.system.service.impl;

import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.system.domain.NdtCourier;
import com.ruoyi.system.domain.NdtDriver;
import com.ruoyi.system.domain.NdtWorkScheduling;
import com.ruoyi.system.dto.NdtWorkSchedulingDto;
import com.ruoyi.system.mapper.NdtCourierMapper;
import com.ruoyi.system.mapper.NdtDriverMapper;
import com.ruoyi.system.mapper.NdtWorkSchedulingMapper;
import com.ruoyi.system.service.INdtCourierService;
import com.ruoyi.system.service.INdtDriverService;
import com.ruoyi.system.service.INdtWorkSchedulingService;
import com.ruoyi.system.service.NdtWorkSchedulingApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author SangY
 * @Date 2025/1/12 23:08
 **/
@Service
public class NdtWorkSchedulingApiServiceImpl implements NdtWorkSchedulingApiService {

    @Autowired
    private NdtDriverMapper ndtDriverMapper;

    @Autowired
    private NdtCourierMapper ndtCourierMapper;

    @Autowired
    private NdtWorkSchedulingMapper ndtWorkSchedulingMapper;

    public NdtWorkSchedulingDto findAllPeople() {
        //查询快递员
        List<NdtCourier> courierList = ndtCourierMapper.list();

        //查询司机
        List<NdtDriver> driverList = ndtDriverMapper.list();

        NdtWorkSchedulingDto dto = new NdtWorkSchedulingDto();
        dto.setCourierList(courierList);
        dto.setDriverList(driverList);
        return dto;

    }

    @Override
    public int initWorkScheduling() {


        NdtWorkSchedulingDto allPeople = findAllPeople();
        List<NdtCourier> courierList = allPeople.getCourierList();
        List<NdtDriver> driverList = allPeople.getDriverList();
        List<NdtWorkScheduling>ndtWorkSchedulingList=new ArrayList<>(courierList.size()+driverList.size());
        if (!CollectionUtils.isEmpty(courierList)){
            courierList.forEach(courier->{
                NdtWorkScheduling ndtWorkScheduling = new NdtWorkScheduling();
                //todo 员工编号后期可能需要考虑权限相关问题
                ndtWorkScheduling.setUserId(SecurityUtils.getUserId());
                ndtWorkScheduling.setUserType(2);
                ndtWorkScheduling.setEmployeeNumber(courier.getCourierAccount());
                ndtWorkScheduling.setName(courier.getCourierName());
                ndtWorkScheduling.setPhone(courier.getPhone());
                ndtWorkScheduling.setCreateBy(SecurityUtils.getUsername());
                ndtWorkScheduling.setCreateTime(new Date());
                ndtWorkSchedulingList.add(ndtWorkScheduling);
            });
        }
        if (!CollectionUtils.isEmpty(driverList)){
            driverList.forEach(driver->{
                NdtWorkScheduling ndtWorkScheduling = new NdtWorkScheduling();
                //todo 司机相关后期可能需要考虑权限相关问题
                ndtWorkScheduling.setUserId(SecurityUtils.getUserId());
                ndtWorkScheduling.setUserType(3);
                ndtWorkScheduling.setEmployeeNumber(driver.getDriverAccount());
                ndtWorkScheduling.setName(driver.getDriverAccount());
                ndtWorkScheduling.setPhone(driver.getPhone());
                ndtWorkScheduling.setCreateBy(SecurityUtils.getUsername());
                ndtWorkScheduling.setCreateTime(new Date());
                ndtWorkSchedulingList.add(ndtWorkScheduling);
            });
        }
        return ndtWorkSchedulingMapper.batchInsert(ndtWorkSchedulingList);

    }


}
