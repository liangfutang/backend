package com.zjut.backend.easychat.controller;

import com.zjut.backend.easychat.common.convention.result.Result;
import com.zjut.backend.easychat.common.convention.result.Results;
import com.zjut.backend.easychat.mapper.UserInfoMapper;
import com.zjut.backend.easychat.param.UserInfoParam;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserInfoController {

    private final UserInfoMapper userInfoMapper;

    @GetMapping("all")
    public Result<?> getUserInfo() {
        return Results.success(userInfoMapper.selectListCondition(new UserInfoParam()));
    }
}
