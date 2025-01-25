package io.github.sonnetsaif.orderservice.dto;
import java.math.BigDecimal;

public record OrderRequest(Long Id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {
}
