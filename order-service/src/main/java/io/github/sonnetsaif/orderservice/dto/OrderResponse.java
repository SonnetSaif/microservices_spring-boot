package io.github.sonnetsaif.orderservice.dto;
import java.math.BigDecimal;

public record OrderResponse(Long Id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {
}
