package ie.atu.cicd1.catalog.cicd1catalogservice.DTO;

import java.math.BigDecimal;

public record CreateProductRequest (
    String name,
    BigDecimal price,
    Long categoryId
    ){}
