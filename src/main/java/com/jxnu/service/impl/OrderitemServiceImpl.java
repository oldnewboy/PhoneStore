package com.jxnu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxnu.dao.OrderitemDao;
import com.jxnu.domain.Orderitem;
import com.jxnu.service.IOrderitemService;
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
public class OrderitemServiceImpl extends ServiceImpl<OrderitemDao, Orderitem> implements IOrderitemService {

}
