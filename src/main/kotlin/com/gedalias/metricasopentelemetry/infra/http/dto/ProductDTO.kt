package com.gedalias.metricasopentelemetry.infra.http.dto

import java.math.BigDecimal


data class ProductDTO(
        val id: String?,
        val title: String?,
        val description: String?,
        val value: BigDecimal?
)

data class CreateProductDTO(
        val title: String,
        val description: String?,
        val value: BigDecimal
)