package Java.OOP.Interfaces.view;

import Java.OOP.Interfaces.data.Student;
import Java.OOP.Interfaces.data.StudentGroup;

public class StudentGroupView {

    public void printStudentGroup(StudentGroup studentGroup){
        for (Student st : studentGroup) {
            System.out.println(st);
        }
    }
    
}
