package Java.OOP.Interfaces.data;

import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<Teacher>{
    @Override
    public int compare(Teacher arg0, Teacher arg1) {
        if (arg0.getSpecialty() == null){
            return 1;
        }
        if (arg1.getSpecialty() == null){
            return -11;
        }
        return arg0.getSpecialty().compareTo(arg1.getSpecialty());
    }  
}


   
