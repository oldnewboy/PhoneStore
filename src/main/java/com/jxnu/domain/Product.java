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
    public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 商品id
     */
        @TableId(value = "proid", type = IdType.AUTO)
      private String proid;

      /**
     * 类别Id
     */
      private String cateid;

      /**
     * 商品名称
     */
      private String name;

      /**
     * 产品主图,url相对地址
     */
      private String mainimage;

      /**
     * 图片地址,json格式,扩展用
     */
      private String subimages;

      /**
     * 商品详情
     */
      private String detail;

      /**
     * 价格,单位-元保留两位小数
     */
      private Double price;

      /**
     * 库存数量
     */
      private Integer stock;

      /**
     * 商品状态.1-在售 2-下架 3-删除
     */
      private Integer status;

      /**
     * 创建时间
     */
      private Date createtime;

      /**
     * 更新时间
     */
      private Date updatetime;


}
