package Java.seminars.seminar_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) {
        writer();
    }
    public static void writer() {
        File file = new File("task_6.txt");
        try {
            FileWriter writer = new FileWriter(file);
            String head = "Name Surname Age\n";
            String lineOne = "Kate Smith 20\n";
            String lineTwo = "Paul Green 25";
            String lineThree = "Mike Black 23\n";
            writer.write(head + lineOne + lineTwo + lineThree);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            // TODO: handle exception
        }

    }
}
