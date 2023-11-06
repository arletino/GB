package Java.OOP.Interfaces.view;

import java.util.List;

import Java.OOP.Interfaces.data.Teacher;

public class TeacherView implements UserView<Teacher> {
    
    public void sendOnConsole(Teacher teacher){
        System.out.println(teacher);
    }
    @Override
    public void sendOnConsole(List<Teacher> teacherList){
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    
}
