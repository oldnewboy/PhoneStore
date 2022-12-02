package com.jxnu.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxnu.domain.Product;
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
public interface ProductDao extends BaseMapper<Product> {

}
