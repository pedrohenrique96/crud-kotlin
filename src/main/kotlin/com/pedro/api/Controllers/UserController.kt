package com.pedro.api.Controllers

import com.pedro.api.Models.Users
import com.pedro.api.Repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RestController
@RequestMapping("user")
class UserController {

    @Autowired
    lateinit var userRepository:  UserRepository

    @GetMapping
    fun list(): List<Users> {
        return userRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody user: Users): Users {
        return userRepository.save(user)
    }
}