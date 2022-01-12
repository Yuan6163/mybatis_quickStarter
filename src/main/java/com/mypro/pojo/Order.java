package com.mypro.pojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author ColdCurrent
 * @Package com.mypro.pojo
 * @Description: 订单实体类
 * @date 2022/1/12 下午 4:55
 */
public class Order {
    private Long id;
    private LocalDateTime orderTime;
    private BigDecimal total;
    private String order_name;
    private Long id_user;
    //代表当前订单从属于哪⼀个客户
    private User user;


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderTime=" + orderTime +
                ", total=" + total +
                ", order_name='" + order_name + '\'' +
                ", id_user=" + id_user +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }
}
