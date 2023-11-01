package com.nx.service;
import java.util.Date;

import com.nx.mapper.UserMapper;
import com.nx.model.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 用户服务测试
 *
 * @author nx
 * @since 2023/10/29
 */
@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void addUserTest() {
        User user = new User();
        user.setUserAccount("123456");
        user.setUsername("testnx");
        user.setAvatarUrl("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("15914405348");
        user.setEmail("11111");
        user.setUserStatus(0);
        user.setDeletedFlag(0);

        userService.save(user);
        System.out.println(user.getId());
    }
}