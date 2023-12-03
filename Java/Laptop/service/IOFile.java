package Java.Laptop.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    private List<String> listlaptops;
    private String path;
    private int fieldsNum = 8; // - Кол-во полей в записи для проверки файла


    public IOFile() { 
        path = "newfile.txt";
        listlaptops = new ArrayList<>();
    }

    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(" ").length != fieldsNum) {
                    System.out.println("Wrong data in file");
                    break;
                }
                this.listlaptops.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void rewriteFile(){
        File file = new File(path);
        if (!listlaptops.isEmpty()){
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                for (String line : listlaptops) {
                    fileWriter.write(line);    
                    }
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else{
            System.out.println("List is empty");
        }
    }
    public void getPath(String path){
        this.path = path;
    }
    public List<String> getListLaptops() {
        return this.listlaptops;
    }
}
