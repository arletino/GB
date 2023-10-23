package Java.HW06.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Java.HW06.laptop.Laptop;

public class File_operation {
    private ArrayList<Laptop> file_laptops;
    private String name;

    public File_operation() {
        this.file_laptops = new ArrayList<>();
    }

    public File_operation(String name) {
        this.name = name;
        this.file_laptops = new ArrayList<>();
    }

    public void readFile(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(" ").length != 5) {
                    System.out.println("Wrong data in file");
                }
                Laptop temp = new Laptop(line.split(" "));
                this.file_laptops.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.name))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.split(" ").length != 5) {
                    System.out.println("Wrong data in file");
                }
                Laptop temp = new Laptop(line.split(" "));
                this.file_laptops.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Laptop> getFileListLaptops() {
        return this.file_laptops;
    }
}
