package com.jxnu.service;

import com.jxnu.domain.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ljp
 * @since 2022-11-27
 */
public interface IUserService{
    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    User doLogin(String username, String password);

    /**
     * 注册
     *
     * @param user
     */
    boolean doRegister(User user);

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    User getUsername(String username);

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> getAllUser();

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    boolean updateUserInfo(User user);



    boolean updatePassword(User user);
}
