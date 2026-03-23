//package com.impact.lessons.controllers;
//
//import com.impact.lessons.models.User;
//import com.impact.lessons.services.UserService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class UserController {
//
//    private final UserService userService = new UserService();
//
//    @PostMapping("/users/create")
//    public User createUser(@RequestBody User user) {
//
//        return userService.createUser(user);
//    }
//
//    @GetMapping("/users/get_all")
//    public List<User> getAllUsers() {
//
//        return userService.getAllUsers();
//    }
//}

package com.impact.lessons.controllers;

import com.impact.lessons.dto.CreateUserRequest;
import com.impact.lessons.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final  UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/create")
    public void createUser(@RequestBody CreateUserRequest request) {
        userService.createUser(request);
    }
}
