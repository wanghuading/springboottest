package com.sz.springboottest.customlabel;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String email;

    @Override
    public String toString() {
        return "User{" +
          "userName='" + userName + '\'' +
          ", email='" + email + '\'' +
          '}';
    }
}
