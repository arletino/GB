package Java.exceptions.Own_exep;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Counter counter = new Counter();
        // System.out.println(counter.getCounter());
        // counter.add();
        // System.out.println(counter.getCounter());
        // try {
        //     counter.close();
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // counter.add();
        // try (Counter counter = new Counter();){
        //     System.out.println(counter.getCounter());
        //     counter.add();
        //     System.out.println(counter.getCounter());
        // } catch(Exception e){
            
        // } 
        // System.out.println(devide(3, 0));
        try {
            fileReader("sdfasfs");
        } catch (NonExistedFileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static double devide(int a, int b){
        double res = 0;
        try{
            res = a / b;
            
        } catch (ArithmeticException e){
            throw new DivideByZeroException();
        }
        return res;
    }
    static void fileReader(String path) throws NonExistedFileException{
        try {
            FileReader fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new NonExistedFileException("Файл не найден");
        }
    }
}
