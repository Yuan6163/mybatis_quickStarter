package com.mypro.mapper.multi;

import com.mypro.pojo.Order;

import java.util.List;

/**
 * @author ColdCurrent
 * @Package com.mypro.mapper
 * @Description: 查询订单的同时还查询该订单所属的用户
 * @date 2022/1/12 下午 5:14
 */
public interface IUserMapper {


    public List<Order> findOrder();
}
