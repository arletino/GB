package Java.OOP.Interfaces.data;

import java.util.Comparator;

public class StreamComporator implements Comparator<StudentGroup>{


    @Override
    public int compare(StudentGroup arg0, StudentGroup arg1) {
        // TODO Auto-generated method stub
        return arg0.getStudentList().size() - arg1.getStudentList().size(); 
    }
    
}
