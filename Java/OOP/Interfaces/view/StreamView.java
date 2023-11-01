package Java.OOP.Interfaces.view;

import Java.OOP.Interfaces.data.Stream;
import Java.OOP.Interfaces.data.StudentGroup;

public class StreamView {

    public void printStream(Stream stream){
        for (StudentGroup st : stream.getList()) {
            System.out.println("Группа " + (stream.getIndex(st)+1));
            StudentGroupView studentGroupView = new StudentGroupView();
             studentGroupView.printStudentGroup(st);
        }
    }
    
}
