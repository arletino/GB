package Java.OOP.Interfaces.view;

import java.util.List;

import Java.OOP.Interfaces.data.Student;



public class StudentView implements UserView<Student>{

    @Override
    public void sendOnConsole(List<Student> list) {
        // TODO Auto-generated method stub
        for (Student student : list) {
            System.out.println(student);
        }
    }

    
}
