package Java.OOP.Interfaces;

import java.util.ArrayList;
import java.util.List;

import Java.OOP.Interfaces.controller.StreamController;
import Java.OOP.Interfaces.controller.StudentGroupController;
import Java.OOP.Interfaces.data.Stream;
import Java.OOP.Interfaces.data.Student;
import Java.OOP.Interfaces.data.StudentGroup;
import Java.OOP.Interfaces.service.StreamService;
import Java.OOP.Interfaces.view.StreamView;

public class Program {
    public static void main(String[] args) {
        StudentGroupController controler = new StudentGroupController();
        Student student1 = new Student("1", "1", "1", 1, 1);
        Student student2 = new Student("2", "2", "2", 2, 2);
        Student student3 = new Student("3", "3", "3", 3, 3);
        List<Student> studentList1 = List.of(new Student[]{student1, student2, student3});
        StudentGroup studentGroup1 = new StudentGroup(studentList1);
        controler.createStudentGroup(studentList1);
        // controler.print();
        Student student4 = new Student("4", "4", "4", 4, 4);
        Student student5 = new Student("5", "5", "5", 5, 5);
        Student student6 = new Student("6", "6", "6", 6, 6);
        Student student7 = new Student("7", "7", "7", 7, 7);
        List<Student> studentList2 = List.of(new Student[]{student4, student5});
        StudentGroup studentGroup2 = new StudentGroup(studentList2);
        Stream stream = new Stream();
        stream.addStudentGroup(studentGroup1);
        stream.addStudentGroup(studentGroup2);
        StreamController streamController = new StreamController();
        streamController.createStream(stream);
        System.out.println("Print created stream");
        streamController.print();
        streamController.sortSize();
        System.out.println("Sorted stream");
        streamController.print();
        Stream stream2 = new Stream();
        stream2.addStudentGroup(studentGroup2);
        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream2);
        streamList.add(stream);
        System.out.println("Sorted list stream");
        int count = 0;
        for (Stream item : streamController.sortedStreams(streamList)) {
            StreamView streamView = new StreamView();
            System.out.println("Stream" + count++);
            streamView.printStream(item);
            
        }
    }
    
}
