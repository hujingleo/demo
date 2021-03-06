package com.example.demo.service;


import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.SysUserEntity;
import com.example.demo.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-09-03 18:04:52
 */
public interface SysUserService extends IService<SysUserEntity> {
    SysUserEntity getByUsername(String username);
    SysUserEntity testget(String username);
}

