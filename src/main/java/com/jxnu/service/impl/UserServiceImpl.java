package com.jxnu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jxnu.dao.UserDao;
import com.jxnu.domain.User;
import com.jxnu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ljp
 * @since 2022-11-27
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User doLogin(String userName, String password) {
        //条件查询
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        //判断账号和密码是否匹配
        lqw.eq(User::getUsername, userName).eq(User::getPassword, password);
        User user = userDao.selectOne(lqw);
        return user;
    }

    @Override
    public boolean doRegister(User user) {

        //获取当前时间的毫秒值
        long time = System.currentTimeMillis();
        //创建日期对象，把当前的毫秒值转成日期对象
        Date date = new Date(time);
        user.setCreatetime(date);
        user.setUpdatetime(date);
        int insert = userDao.insert(user);
        System.out.println(insert);
        return insert > 0;
    }

    @Override
    public User getUsername(String username) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.eq(User::getUsername, username);
        User user = userDao.selectOne(lqw);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = userDao.selectList(null);
        return userList;
    }

    @Override
    public boolean updateUserInfo(User user) {
        int update = userDao.updateById(user);
        return update > 0;
    }

    @Override
    public boolean updatePassword(User user) {
        return false;
    }
}
