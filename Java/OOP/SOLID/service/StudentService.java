package Java.OOP.SOLID.service;

import java.util.List;

import Java.OOP.SOLID.model.User;

public interface StudentService {
    List<User> getAllStudent();

    User getStudentById(Integer id);
}
