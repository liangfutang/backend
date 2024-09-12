package com.zjut.easychat.mapper;

import com.zjut.easychat.entity.UserInfoDO;
import com.zjut.easychat.param.UserInfoParam;

import java.util.List;

public interface UserInfoMapper {
    List<UserInfoDO> selectListCondition(UserInfoParam param);
}
