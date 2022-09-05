package com.imalipayassignment.userAccount.user;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name= "user")
@Entity
@Data
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column (name = "title")
    public String title;

    @Column (name = "min_salary")
    public int min_salary;

    @Column (name = "max_salary")
    public int max_salary;

    @Column (name = "loan")
    public String loan;

    @Column (name = "payment")
    public String payment;

    @Column (name = "balance")
    private long balance;




}
