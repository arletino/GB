package Java.OOP.Interfaces.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Java.OOP.Interfaces.data.Teacher;
import Java.OOP.Interfaces.data.TeacherComparator;
import Java.OOP.Interfaces.data.User;

public class TeacherService {
    private Teacher teacher;
    private List<Teacher> teacherList;

    public void createTeacherList(List<Teacher> teacherList){
        this.teacherList = new ArrayList<>(teacherList);
    }
    public Teacher createTeacher(User user, String specialty){
        int id = 0;
        if (this.teacherList == null){
            createTeacherList(new ArrayList<>());
        }
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId() > id)
                id = teacher.getTeacherId();
        }
        this.teacher = new Teacher(++id, user.getFirstName(), user.getSecondName(), user.getLastName(), specialty);
        this.teacherList.add(this.teacher);
        return this.teacher;
    }
    public List<Teacher> getListTeacher(){
        return this.teacherList;
    }

    public List<Teacher> sortSpecialty(List<Teacher> teacherList){
        TeacherComparator<Teacher> teacherComparator = new TeacherComparator<>();
        teacherList.sort(teacherComparator);
        return teacherList;
    }
    public List<Teacher> sortId(List<Teacher> teacherList){
        Collections.sort(teacherList);
        return teacherList;
    }
    
}
