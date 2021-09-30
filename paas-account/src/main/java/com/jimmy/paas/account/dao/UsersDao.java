package com.jimmy.paas.account.dao;

import com.jimmy.paas.account.entity.UsersEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jimmy
 * @since 2021-09-27
 */
@Mapper
public interface UsersDao extends BaseMapper<UsersEntity> {

}
