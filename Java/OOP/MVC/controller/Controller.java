package Java.OOP.MVC.controller;

import java.util.ArrayList;
import java.util.List;


import Java.OOP.MVC.model.Student;
import Java.OOP.MVC.model.Teacher;
import Java.OOP.MVC.model.Type;
import Java.OOP.MVC.model.User;
import Java.OOP.MVC.service.DataService;
import Java.OOP.MVC.service.GroupService;
import Java.OOP.MVC.view.StudentView;
import Java.OOP.MVC.view.StudyGroupView;
import Java.OOP.MVC.view.TeacherView;

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
            studentView.printOnConsole((Student) user);
        }
    }

    public void getAll(){
        List<User> userList = service.getUsersList();
        for (User user : userList){
            if (user instanceof Student){
                studentView.printOnConsole((Student) user);
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
