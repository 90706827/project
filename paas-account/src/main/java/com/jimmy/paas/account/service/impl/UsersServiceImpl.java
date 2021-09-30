package com.jimmy.paas.account.service.impl;

import com.jimmy.paas.account.entity.UsersEntity;
import com.jimmy.paas.account.dao.UsersDao;
import com.jimmy.paas.account.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jimmy
 * @since 2021-09-27
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao, UsersEntity> implements UsersService {

}
