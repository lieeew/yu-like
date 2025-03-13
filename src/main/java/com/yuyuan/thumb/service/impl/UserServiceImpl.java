package com.yuyuan.thumb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuyuan.thumb.model.entity.User;
import com.yuyuan.thumb.service.UserService;
import com.yuyuan.thumb.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author pine
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

}




