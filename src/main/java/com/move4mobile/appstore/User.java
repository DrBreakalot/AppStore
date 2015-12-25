package com.move4mobile.appstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Wilco Wolters on 25/12/2015.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String emailAddress;

    User(){}

    public User(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
