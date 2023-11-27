package Java.OOP.MVC.view;

import java.util.Arrays;
import java.util.List;

import Java.OOP.MVC.model.Student;
import Java.OOP.MVC.model.Teacher;
import Java.OOP.MVC.model.User;

public class StudyGroupView {

    public void printOnConsole(List<User> studyGroup){
        
        for (User teacher: studyGroup) {
            if(teacher instanceof Teacher){
                System.out.println(((Teacher)teacher).toString());
            }
        }
        
        for (User student : studyGroup) {
            
            if(student instanceof Student){
                System.out.println(((Student)student).toString());
            }
        }
        
    }
    public void printOnConsoleListGroup(int[] groupNum){
        System.out.println("Group Numbers");
        System.out.println(Arrays.toString(groupNum));
    }
}
