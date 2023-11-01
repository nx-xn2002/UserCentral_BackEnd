package com.nx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nx.model.domain.User;
import com.nx.service.UserService;
import com.nx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 18702
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-10-28 21:25:11
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




