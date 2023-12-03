package Java.OOP.SOLID.service;

import java.util.ArrayList;
import java.util.List;

import Java.OOP.SOLID.model.Student;
import Java.OOP.SOLID.model.Teacher;
import Java.OOP.SOLID.model.Type;
import Java.OOP.SOLID.model.User;

public interface ListService {

    List<User> userList = new ArrayList<>();

    void create(String firstName, String secondName, String lastName, Type type);

    List<User> getUsersList();
}
