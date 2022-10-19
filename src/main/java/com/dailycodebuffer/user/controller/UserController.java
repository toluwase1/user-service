package com.dailycodebuffer.user.controller;

import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("inside save user of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    private ResponseTemplateVO getUserWithDepartment (@PathVariable("id") Long userId) {
        log.info("inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }
}
