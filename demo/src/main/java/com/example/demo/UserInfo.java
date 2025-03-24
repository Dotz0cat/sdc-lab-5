package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {

    private String username;
    private int ID;
    private int selectedButton;

    UserInfo(String username, int ID, int selectedButton) {
        this.username = username;
        this.ID = ID;
        this.selectedButton = selectedButton;
    }

    public UserInfo() {}
}
