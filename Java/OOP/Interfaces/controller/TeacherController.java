package Java.OOP.Interfaces.controller;

import java.util.List;

import Java.OOP.Interfaces.data.Teacher;
import Java.OOP.Interfaces.data.User;
import Java.OOP.Interfaces.data.UserComparator;
import Java.OOP.Interfaces.service.TeacherService;
import Java.OOP.Interfaces.view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    
    TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();

    public void createTeacherList(List<Teacher> teacherList){
        teacherService.createTeacherList(teacherList);
    }
    public void printTeacher(Teacher teacher){
        teacherView.sendOnConsole(teacher);
    }
    public void printListTeacher(){
        teacherView.sendOnConsole(teacherService.getListTeacher());
    }
    public void sortId(){
        teacherService.sortId(teacherService.getListTeacher());
    }
    public void sortSpecialty(){
        teacherService.sortSpecialty(teacherService.getListTeacher());
    }
    public void sortFIO(){
        teacherService.getListTeacher().sort(new UserComparator());
    }

    public void create(Teacher teacher){
        teacherService.createTeacher(teacher, teacher.getSpecialty());
    }

    public List<Teacher> getList(){
        return teacherService.getListTeacher();
    }

    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        // TODO Auto-generated method stub
        User person = new User(firstName, secondName, lastName);
        String specialty = null; 
        return teacherService.createTeacher(person, specialty);
    }



}