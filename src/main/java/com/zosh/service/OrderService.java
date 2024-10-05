package com.zosh.service;

import com.zosh.domain.OrderType;
import com.zosh.modal.Coin;
import com.zosh.modal.Order;
import com.zosh.modal.OrderItem;
import com.zosh.modal.User;
import jakarta.transaction.Transactional;

import java.util.List;

public interface OrderService {
    Order createOrder(User user, OrderItem orderItem, OrderType orderType);
    Order getOrderById(Long orderId);
    List<Order> getAllOrderOfUser(Long userId,OrderType orderType, String assetSymbol);
    Order processOrdder(Coin coin, double quantity,OrderType orderType) throws Exception;

    @Transactional
    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;
}
