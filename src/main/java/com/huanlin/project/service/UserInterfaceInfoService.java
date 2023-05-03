package com.huanlin.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hunalin.model.entity.UserInterfaceInfo;
import com.huanlin.project.model.vo.UserInterfaceInfoVo;

import java.util.List;

/**
 *
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean addInterfaceCount(long  interfaceinfoId, long userId);

    List<UserInterfaceInfoVo> getUserInterfaceTotalNums(long limit);

    boolean giveRegistryApiCount(Long userId, List<Long> ids);

    List<UserInterfaceInfo> getInterfaceInfoIdByUserId(Long id);
}
