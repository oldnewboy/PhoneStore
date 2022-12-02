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
    public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "carid", type = IdType.AUTO)
      private String carid;

      /**
     * 用户表id
     */
      private String userid;

      /**
     * 商品id
     */
      private String proid;

      /**
     * 数量
     */
      private Integer quantity;

      /**
     * 创建时间
     */
      private Date createtime;

      /**
     * 更新时间
     */
      private Date updatetime;


}
