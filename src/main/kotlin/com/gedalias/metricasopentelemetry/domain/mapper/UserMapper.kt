package com.gedalias.metricasopentelemetry.domain.mapper

import com.gedalias.metricasopentelemetry.domain.User
import com.gedalias.metricasopentelemetry.domain.dto.CreateUserDTO
import com.gedalias.metricasopentelemetry.domain.dto.UpdateUserDTO
import com.gedalias.metricasopentelemetry.domain.dto.UserDTO


fun UserDTO.updateValues() = User(
        id = id,
        name = name,
        email = email,
        birthday = birthday
)

fun User.toDTO() = UserDTO(
        id = id,
        name = name,
        email = email,
        birthday = birthday
)

fun CreateUserDTO.updateValues() = User(
        id = null,
        name = name,
        email = email,
        birthday = birthday
)

fun UpdateUserDTO.updateValues(user: User) = User(
        id = user.id,
        name = name ?: user.name,
        email = email ?: user.email,
        birthday = birthday ?: user.birthday
)