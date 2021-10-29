package com.pedro.api.Models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Users(@Id
    @GeneratedValue
val id: Long = 0L,
    val name: String = "",
    val email: String = "")