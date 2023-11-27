package Java.OOP.MVC.service;

import java.util.ArrayList;
import java.util.List;

import Java.OOP.MVC.model.Teacher;
import Java.OOP.MVC.model.User;
import Java.OOP.MVC.model.Student;
import Java.OOP.MVC.model.Type;

public class DataService {
    private List<User> userList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if (type == Type.STUDENT){
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }else if (type == Type.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }
    
    private int getFreeId(Type type){
        boolean itsStudent = type == Type.STUDENT;
        for (int i = userList.size() - 1; i >= 0; i--) {
            User user = userList.get(i);
            if(userList.get(i) instanceof Student && itsStudent){
                return ((Student) user).getStudentId() + 1;
            }
            else if (userList.get(i) instanceof Teacher && !itsStudent){
                return ((Teacher) user).getTeacherId() + 1;
            }
        }
        return 0;
    }
    public List<User> getUsersList(){
        return userList;
    }
    public List<User> getAllStudent(){
        List<User> users = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Student)
            users.add(user);
        }
        return users;
    }
    public List<User> getAllTeacher(){
        List<User> users = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Teacher)
            users.add(user);
        }
        return users;
    }

    public User getStudentById(Integer id){
        for (User user : getAllStudent()) {
            if (((Student)user).getStudentId() == id){
                return user;
            }
        }
        return null; 
    }
    
    public User getTeacherById(Integer id){
        for (User user : getAllTeacher()) {
            if (((Teacher)user).getTeacherId() == id){
                return user;
            }
        }
        return null; 
    }
    
}
