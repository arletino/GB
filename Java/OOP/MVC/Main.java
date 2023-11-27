package Java.OOP.MVC;

import Java.OOP.MVC.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "1", "1");
        controller.createStudent("2", "1", "1");
        controller.createTeacher("1", "2", "2");
        controller.getAllStudent();
        System.out.println();
        controller.getAll();
        System.out.println();
        controller.createStudent("3", "1", "1");
        controller.createStudent("4", "1", "1");
        controller.createStudent("5", "1", "1");
        controller.createTeacher("2", "2", "2");
        controller.getAllStudent();
        System.out.println();
        controller.getAll();
        System.out.println();
        Integer[] studentIdList1 = {2, 3, 0};
        controller.createGroup(0, studentIdList1);
        Integer[] studentIdList2 = {1, 4, 3};
        controller.getGroup(0);
        controller.createGroup(1, studentIdList2);
        controller.getListGroup();
        controller.getGroup(1);
    }
}
