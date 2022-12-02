package com.jxnu.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljp
 * @since 2022-11-27
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 用户表id
     */
        @TableId(value = "userid", type = IdType.AUTO)
      private String userid;

      /**
     * 用户名
     */
      private String username;

      /**
     * 用户密码，MD5加密
     */
      private String password;

    private String phone;

      /**
     * 角色0-管理员,1-普通用户
     */
      private Integer role;

      /**
     * 创建时间
     */
      private Date createtime;

      /**
     * 更新时间
     */
      private Date updatetime;


}
