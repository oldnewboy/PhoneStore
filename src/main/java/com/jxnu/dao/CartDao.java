package com.jxnu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxnu.domain.Cart;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ljp
 * @since 2022-11-27
 */
@Mapper
public interface CartDao extends BaseMapper<Cart> {

}
