package com.shryne.rest.controller

import com.shryne.rest.model.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {
    @GetMapping("/{id}")
    fun get(@PathVariable id: Int): ResponseEntity<User> = ResponseEntity.ok(User(id, "abc"))
}