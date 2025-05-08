package com.udemy.Controllers;

import com.udemy.model.User;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPageController {

    @GetMapping("/user")
    public User user()
    {
        User user = new User();
        user.setName("Asad Ullah");
        user.setEmail("asadmahmud211@gmai.com");
        user.setId("1");
        return user;
    }

    //PathVariable

    @GetMapping("/{id}/{id2}")
    public String path(@PathVariable String id, @PathVariable String id2)
    {
        return "Path Variable is :" + id + "     " + id2;
    }

    // Request Parameter
    @GetMapping("/requestparam")
    public String reuqestparam(@RequestParam String name, @RequestParam(required = false, defaultValue = "") String email)
    {
        return "Your Name is :" + name + " And email is : " + email;
    }

}
