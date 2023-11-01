package Java.OOP.Interfaces.service;

import java.util.Collections;
import java.util.List;

import Java.OOP.Interfaces.data.Stream;
import Java.OOP.Interfaces.data.StreamComporator;
import Java.OOP.Interfaces.data.StudentGroup;

public class StreamService  {

    private Stream stream;

    public void createStream(List<StudentGroup> stream){
        this.stream = new Stream(stream);
    }

    public List<StudentGroup> getList(){
        return this.stream.getList();
    }

    public void sortSize(){
        Collections.sort(this.getList(), new StreamComporator());
    }
    public List<Stream> sortListStreams(List<Stream> listStreams){
        Collections.sort(listStreams);
        return listStreams;
    }
    
    public Stream getStream() {
        return stream;
    }
    
}
