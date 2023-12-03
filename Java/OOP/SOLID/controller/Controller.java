package Java.OOP.SOLID.controller;

import java.util.ArrayList;
import java.util.List;


import Java.OOP.SOLID.model.Student;
import Java.OOP.SOLID.model.Teacher;
import Java.OOP.SOLID.model.Type;
import Java.OOP.SOLID.model.User;
import Java.OOP.SOLID.service.DataService;
import Java.OOP.SOLID.service.GroupService;
import Java.OOP.SOLID.view.StudentView;
import Java.OOP.SOLID.view.StudyGroupView;
import Java.OOP.SOLID.view.TeacherView;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView =  new StudentView();
    private final GroupService groupService = new GroupService();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    private final TeacherView teacherView = new TeacherView();
    
    public void createStudent(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    
    public void createTeacher(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }
    
    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList){
            studentView.printOnConsole((Student) user); // Liskov’s Substitution Principle
        }
    }

    public void getAll(){
        List<User> userList = service.getUsersList();
        for (User user : userList){
            if (user instanceof Student){
                studentView.printOnConsole((Student) user); // Liskov’s Substitution Principle
            } else {
                teacherView.printOnConsole((Teacher)user);
            }
        }

    }
    
    public void createGroup(Integer teacherId, Integer[] studentId){
        List<User> studentGroup = new ArrayList<>();
        for (Integer id: studentId) {
            try {
                if(!(service.getStudentById(id) == null)){
                    studentGroup.add(service.getStudentById(id));
                }
            } catch (NullPointerException e){}
        }
        groupService.createGroup(service.getTeacherById(teacherId), studentGroup);
    }
    public void getListGroup(){
        studyGroupView.printOnConsoleListGroup(groupService.getGroupList());

    }
    public void getGroup(Integer id){
        System.out.println("Group " + id);
        studyGroupView.printOnConsole(groupService.getGroup(service.getUsersList(), id));
    }
}
