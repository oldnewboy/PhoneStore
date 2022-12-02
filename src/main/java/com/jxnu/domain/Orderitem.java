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
    public class Orderitem implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 订单子表id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private String id;

      /**
     * 订单id
     */
      private String orderid;

      /**
     * 用户表id
     */
      private String userid;

      /**
     * 商品id
     */
      private String proid;

      /**
     * 商品名称
     */
      private String proname;

      /**
     * 商品图片地址
     */
      private String proimage;

      /**
     * 生成订单时的商品单价，单位是元,保留两位小数
     */
      private Double currentunitprice;

      /**
     * 商品数量
     */
      private Integer quantity;

      /**
     * 商品总价,单位是元,保留两位小数
     */
      private Double totalprice;

    private Date createtime;

    private Date updatetime;


}
