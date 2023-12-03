package Java.OOP.SOLID.view;

import Java.OOP.SOLID.model.Teacher;

public class TeacherView { // Применен принцип SRP
    public void printOnConsole(Teacher teacher){
        System.out.println(teacher.toString());
    }
    
}
