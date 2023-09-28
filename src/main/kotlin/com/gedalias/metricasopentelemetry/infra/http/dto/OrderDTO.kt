package com.gedalias.metricasopentelemetry.infra.http.dto

import com.gedalias.metricasopentelemetry.domain.Status
import java.math.BigDecimal
import java.time.LocalDateTime

data class CreateOrderDTO(
        val user: String,
        val products: List<String>,
        val value: BigDecimal
)

data class OrderDTO(
    val id: String?,
    val user: UserDTO?,
    val products: List<ProductDTO>?,
    val value: BigDecimal?,
    val status: Status?,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?
)

data class UpdateOrderDTO(
    val id: String?,
    val user: String?,
    val products: List<String>?,
    val status: Status?,
    val value: BigDecimal?
)
