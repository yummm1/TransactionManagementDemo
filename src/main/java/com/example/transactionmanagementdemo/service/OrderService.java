package com.example.transactionmanagementdemo.service;

import com.example.transactionmanagementdemo.dao.OrdersDao;
import com.example.transactionmanagementdemo.domain.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderService {
    private final OrdersDao ordersDao;

    @Autowired
    public OrderService(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    @Transactional
    public List getAllOrders(int user_id){return ordersDao.getAllOrders(user_id);}

    @Transactional
    public List getAllOrdersAdmin(){return ordersDao.getAllOrdersAdmin();}

    @Transactional
    public void cancelOrder(int order_id){ ordersDao.cancelOrder(order_id);}

    @Transactional
    public void completeOrder(int order_id){ ordersDao.completeOrder(order_id);}

    @Transactional
    public List getOrderById(int order_id){ return ordersDao.getOrderById(order_id);}
}
