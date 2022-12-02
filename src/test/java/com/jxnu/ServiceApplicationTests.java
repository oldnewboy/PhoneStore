package com.jxnu;

import com.jxnu.dao.UserDao;
import com.jxnu.domain.User;
import com.jxnu.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ServiceApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private IUserService userService;

    @Test
    void testGetAll() {
        User user = userDao.selectById(1);
        System.out.println(user);
    }

    @Test
    void testDoLogin(){
        User login = userService.doLogin("李四", "111");
        System.out.println(login);
        System.out.println("666");
    }

}
