package Java.OOP.Interfaces.service;

import java.util.ArrayList;
import java.util.List;

import Java.OOP.Interfaces.data.Student;
import Java.OOP.Interfaces.data.StudentGroup;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
    }
    public Student createStudent(String firstName, String secondName, String lastName){
        if(studentGroup == null)
            createGroup(new ArrayList<>());
        int maxid = 0;
        for(Student student : studentGroup.getStudentList())
            if (student.getStudentId() > maxid)
                maxid = student.getStudentId();
        maxid++;
        Student student = new Student(firstName, secondName, lastName, maxid, 0);
        studentGroup.addGroup(student);
        return student;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void printStudentGroup(){
        for (Student st : studentGroup) {
            System.out.println(st);
        }
    }
    
}
