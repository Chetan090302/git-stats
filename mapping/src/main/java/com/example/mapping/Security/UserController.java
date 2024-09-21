package com.example.mapping.Security;

import jakarta.persistence.Entity;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo Userrepo;
    @PostMapping("/post")
    public Users method1(@RequestBody Users obj1)
    {
        return Userrepo.save(obj1);
    }

    @GetMapping("/get")
    public List<Users> method2()
    {
        return Userrepo.findAll();
    }
}
