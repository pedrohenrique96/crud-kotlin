package com.pedro.api.Repository

import com.pedro.api.Models.Users
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<Users, Long>