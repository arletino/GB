package Java.OOP.SOLID.service;

import java.util.List;

import Java.OOP.SOLID.model.User;

public interface TeacherService {
    List<User> getAllTeacher();
    User getTeacherById(Integer id);
}
