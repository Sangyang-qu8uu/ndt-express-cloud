package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 排班管理对象 ndt_work_scheduling
 * 
 * @author ruoyi
 * @date 2025-01-12
 */
public class NdtWorkScheduling extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** 员工编号 */
    @Excel(name = "员工编号")
    private Long userId;

    /** 1:员工，2：快递员，3：司机 */
    @Excel(name = "1:员工，2：快递员，3：司机")
    private Integer userType;

    /** 员工账号 */
    @Excel(name = "员工账号")
    private String employeeNumber;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String name;

    /** 员工手机号 */
    @Excel(name = "员工手机号")
    private String phone;

    /** 工作模式id，如果没有工作模式，默认不上班 */
    @Excel(name = "工作模式id，如果没有工作模式，默认不上班")
    private String workPatternId;

    /** 状态（默认为0） */
    @Excel(name = "状态", readConverterExp = "默=认为0")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserType(Integer userType) 
    {
        this.userType = userType;
    }

    public Integer getUserType() 
    {
        return userType;
    }
    public void setEmployeeNumber(String employeeNumber) 
    {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() 
    {
        return employeeNumber;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setWorkPatternId(String workPatternId) 
    {
        this.workPatternId = workPatternId;
    }

    public String getWorkPatternId() 
    {
        return workPatternId;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("userType", getUserType())
            .append("employeeNumber", getEmployeeNumber())
            .append("name", getName())
            .append("phone", getPhone())
            .append("workPatternId", getWorkPatternId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
