package Java.OOP.Interfaces.data;

import java.util.ArrayList;
import java.util.List;

public class Stream implements Comparable <Stream>{
    private List<StudentGroup> stream;

    public Stream(){
        this.stream = new ArrayList<>();
    }
    public Stream(List<StudentGroup> stream){
        this.stream = new ArrayList<>(stream);
    }
    public List<StudentGroup> getList() {
        return stream;
    }
    
    public int getIndex(StudentGroup studentGroup){
        return stream.indexOf(studentGroup);
    }
    public int size(){
        return stream.size();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        this.stream.add(studentGroup);
    }

    @Override
    public int compareTo(Stream o) {
        // TODO Auto-generated method stub
        return this.size() - o.size();
    }
}
