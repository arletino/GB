package Java.OOP.Interfaces.controller;

import java.util.Collections;
import java.util.List;

import Java.OOP.Interfaces.data.Stream;
import Java.OOP.Interfaces.data.StreamComporator;
import Java.OOP.Interfaces.data.StudentGroup;
import Java.OOP.Interfaces.service.StreamService;
import Java.OOP.Interfaces.view.StreamView;

public class StreamController extends StudentGroupController {

    StreamService streamService = new StreamService();
    StreamView streamView = new StreamView();


    public void createStream(List<StudentGroup> stream) {
        // TODO Auto-generated method stub
        streamService.createStream(stream);
    }

    public void createStream(Stream stream) {
        // TODO Auto-generated method stub
        List<StudentGroup> listStudentGroups = stream.getList(); 
        streamService.createStream(listStudentGroups);
    }
    public void sortSize(){
        streamService.sortSize();; 
    } 
    public List<Stream> sortedStreams(List<Stream> streamList){
        return streamService.sortListStreams(streamList);
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        streamView.printStream(streamService.getStream());
    }

    

    
}
