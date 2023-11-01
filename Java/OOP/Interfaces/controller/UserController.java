package Java.OOP.Interfaces.controller;

import Java.OOP.Interfaces.data.User;

public interface UserController <T extends User>{
    T create(String firstName, String secondName, String lastName);
}