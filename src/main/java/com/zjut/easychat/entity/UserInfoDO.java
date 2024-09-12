package com.zjut.easychat.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user_info")
public class UserInfoDO {
    @TableId
    private Integer id;
}
