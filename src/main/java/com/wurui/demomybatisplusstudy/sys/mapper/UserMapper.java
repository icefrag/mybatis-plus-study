package com.wurui.demomybatisplusstudy.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wurui.demomybatisplusstudy.sys.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wurui
 * @since 2019-04-19
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<User> selectPage(Page page);
}
