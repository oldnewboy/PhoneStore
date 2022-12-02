package com.jxnu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxnu.dao.CartDao;
import com.jxnu.domain.Cart;
import com.jxnu.service.ICartService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljp
 * @since 2022-11-27
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartDao, Cart> implements ICartService {

}
