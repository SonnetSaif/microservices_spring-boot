package io.github.sonnetsaif.orderservice.service;

import io.github.sonnetsaif.orderservice.dto.OrderRequest;
import io.github.sonnetsaif.orderservice.dto.OrderResponse;
import io.github.sonnetsaif.orderservice.model.Order;
import io.github.sonnetsaif.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public void placeOrder(OrderRequest orderRequest) {
//
//        Order order = Order.builder()
//                .orderNumber(UUID.randomUUID().toString())
//                .skuCode(orderRequest.skuCode())
//                .price(orderRequest.price())
//                .quantity(orderRequest.quantity())
//                .build();
//        orderRepository.save(order);
//        System.out.println("Order Placed");

        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setSkuCode(orderRequest.skuCode());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);

//        return new OrderResponse(order.getId(), order.getOrderNumber(), order.getSkuCode(), order.getPrice(), order.getQuantity());
        System.out.println("Order Placed");
    }
}
