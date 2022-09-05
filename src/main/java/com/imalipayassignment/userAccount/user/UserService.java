package com.imalipayassignment.userAccount.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void createUser(User user) {
    }

    public void searchUser() {
    }

    public void createUserLoan(User loan) {
    }

    public void searchLoan(String id) {
    }

    public void updateLoanPayment() {
    }
}
