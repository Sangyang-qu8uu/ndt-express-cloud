package com.ruoyi.system.utils;

import com.ruoyi.system.constants.WorkConstants;
import com.ruoyi.system.domain.NdtWorkPattern;
import com.ruoyi.system.enums.WorkPatternEnum;

/**
 * @Description
 * @Author SangY
 * @Date 2025/1/8 22:38
 **/
public class WorkPatternUtils {
    public static String toWorkDate(NdtWorkPattern entity) {
        String workPatternType = entity.getWorkPatternType();
        if (workPatternType .equals(WorkPatternEnum.Weeks.getType()) ) { //周期制
            String workDate = String.format(WorkConstants.WORK_DATE_WEEKS, entity.getMonday(), entity.getTuesday(),
                    entity.getWednesday(), entity.getThursday(), entity.getFriday(),
                    entity.getSaturday(), entity.getSunday());
            return workDate.replace("1", "上").replace("2", "休");
        } else {
            return String.format(WorkConstants.WORK_DATE_CONTINUITYS,
                    entity.getWorkDayNum(), entity.getRestDayNum());
        }
    }
}
