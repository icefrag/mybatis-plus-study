package com.wurui.demomybatisplusstudy.sys.service.impl;

import com.wurui.demomybatisplusstudy.sys.entity.User;
import com.wurui.demomybatisplusstudy.sys.mapper.UserMapper;
import com.wurui.demomybatisplusstudy.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurui
 * @since 2019-04-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
