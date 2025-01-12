package com.ruoyi.system.api;

import com.ruoyi.common.core.constant.ServiceNameConstants;
import com.ruoyi.system.api.factory.RemoteUserFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 * @Description
 * @Author SangY
 * @Date 2025/1/12 23:01
 **/
@FeignClient(contextId = "remoteSystemService", value = ServiceNameConstants.SYSTEM_SERVICE)
public interface RemoteSystemService {

}
