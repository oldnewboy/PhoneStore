package com.jxnu.controller;


import com.jxnu.domain.Code;
import com.jxnu.domain.Result;
import com.jxnu.domain.User;
import com.jxnu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ljp
 * @since 2022-11-27
 */
@RestController
@CrossOrigin
@EnableWebMvc
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/ulogin")
    public Result doLogin(User user) {
        User loginUser = userService.doLogin(user.getUsername(), user.getPassword());
        if (loginUser != null) {
            return new Result(Code.SUCCESS, "登陆成功！");
        } else {
            return new Result(Code.FAIL, "登陆失败，请检查用户名或密码是否正确！");
        }
    }

    @PostMapping("/alogin")
    public Result AdoLogin(User user) {
        User loginUser = userService.doLogin(user.getUsername(), user.getPassword());
        if (loginUser != null) {
            if (loginUser.getRole() == 0)
                return new Result(Code.SUCCESS, "登陆成功！");
            else
                return new Result(Code.FAIL, "登陆失败！您不是管理员");
        } else {
            return new Result(Code.FAIL, "登陆失败,用户名或密码错误！");
        }
    }

    @PostMapping("/register")
    public Result doRegister(User user) {
        // 判断用户是否存在
        boolean flag = userService.getUsername(user.getUsername()) == null;
        if (flag == false) return new Result(Code.FAIL, "注册失败，该用户已存在");
        boolean registerState = userService.doRegister(user);
        if (registerState == true) {
            return new Result(Code.SUCCESS, "注册成功");
        } else {
            return new Result(Code.FAIL, "注册失败");
        }
    }

    @PutMapping("/update")
    public Result updateUserInfo(@RequestBody User user) {
        boolean updateState = userService.updateUserInfo(user);
        String msg = updateState ? "修改成功" : "修改失败";
        return new Result(updateState ? Code.UPDATE_OK : Code.UPDATE_ERR, updateState,msg);
    }

}

