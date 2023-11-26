
package com.example.mySpringProject.controller;
import com.example.mySpringProject.model.SignUp;
import com.example.mySpringProject.service.UserServiceIMPL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
@Controller
public class FirstController {

    @Autowired
    UserServiceIMPL service;  //inject the dependency --> field level dependency
    //Forward data to service
    
     @GetMapping("/signup")
    public String signupForm() {
        return "signup";
    }
      @PostMapping("/signup")
     public String signupFormSubmit(@ModelAttribute SignUp user) {
        System.out.println("login");
        service.addUser(user);  // Assuming service is responsible for saving users
        return "login";
       
    }
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
     @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        SignUp user = service.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            // User is valid, you can set a session variable to remember the user's login state if needed
            System.out.println("login successful");
            return "studHome"; // Redirect to the dashboard page on successful login
        } else {
            model.addAttribute("error", "Invalid Username or Password. Please try again.");
            System.out.println("login failed");
            return "login"; // Stay on the login page with an error message
        }
    }
    // @GetMapping("/forgotPassword")
    // public  getMethodName(@RequestParam String param) {
    //     return new SomeData();
    // }
    
    @GetMapping("/studHome")
    public String studentHomePage() {
        return "studHome";
    }
 
    @GetMapping("/users")
    public String listUsers(Model model) {
    List<SignUp> users = service.getAllStud(); // Retrieve all user records
    model.addAttribute("users", users);
        return "studData"; // Thymeleaf template name
    }

    @GetMapping("/users/{id}")
    public String deleteUser(@PathVariable("id") int userId) {
    service.deleteUserById(userId);
        return "redirect:/users"; // Redirect to the user list page after deletion
    }

    @GetMapping("select/{id}")
    public String selctbyId(@PathVariable int id, Model model){
    SignUp user=service.selectUserById(id);
    model.addAttribute("users", user);
        return "studData";
    }

   
}
