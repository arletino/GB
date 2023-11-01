package Java.OOP.Interfaces.data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int counter;

    private List<StudentGroup> stream;

    public StreamIterator(Stream stream) {
        this.counter = 0;
        this.stream = stream.getList();
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return counter < stream.size();
    }

    @Override
    public  StudentGroup next() {
        // TODO Auto-generated method stub
        if (!hasNext())
            return null;
        counter++;
        return stream.get(counter);
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub
        stream.remove(counter);
    }
}
