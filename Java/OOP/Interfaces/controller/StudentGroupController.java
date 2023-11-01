package Java.OOP.Interfaces.controller;

import java.util.List;

import Java.OOP.Interfaces.data.Student;
import Java.OOP.Interfaces.service.StudentGroupService;

public class StudentGroupController implements UserController<Student>{

    StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudentGroup(List<Student> studentList) {
        studentGroupService.createGroup(studentList);
    }

    public void print() {
        studentGroupService.printStudentGroup();
    }

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        // TODO Auto-generated method stub
        return studentGroupService.createStudent(firstName, secondName, lastName);
    }
}
