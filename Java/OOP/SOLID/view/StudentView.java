package Java.OOP.SOLID.view;

import Java.OOP.SOLID.model.Student;

public class StudentView { // Применен принцип SRP
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }

}
