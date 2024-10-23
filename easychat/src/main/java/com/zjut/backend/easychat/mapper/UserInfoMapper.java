package com.zjut.backend.easychat.mapper;


import com.zjut.backend.easychat.entity.UserInfoDO;
import com.zjut.backend.easychat.param.UserInfoParam;

import java.util.List;

public interface UserInfoMapper {
    List<UserInfoDO> selectListCondition(UserInfoParam param);
}
