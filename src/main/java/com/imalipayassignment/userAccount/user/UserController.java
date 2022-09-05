package com.imalipayassignment.userAccount.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping (value = "/user", method= RequestMethod.POST)
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }

    @RequestMapping(value = "/user")
    public void searchUser(){
        userService.searchUser();
    }

    @RequestMapping (value = "/user_loan", method= RequestMethod.POST)
    public void createUserLoan(@RequestBody User loan){
        userService.createUserLoan(loan);
    }

    @RequestMapping (value = "/loan/{id}")
    public void searchLoan(@PathVariable String id){
        userService.searchLoan(id);
    }

    @RequestMapping (value = "/payment}", method= RequestMethod.PUT)
    public void updateLoanPayment (@RequestBody User location, @PathVariable Long id) {
        userService.updateLoanPayment();
    }

    @RequestMapping (value = "/payment}")
    public void searchPayment(@PathVariable String payment){
        userService.searchLoan(payment);
    }


}
