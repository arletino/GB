package Java.exceptions.Own_exep;

import java.util.ArrayList;
import java.util.List;

/**
 Напишите метод, на вход которого подаётся двумерный строковый массив размером 3х3.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

 1. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось
 (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
 с детализацией, в какой именно ячейке лежат неверные данные.

 2. В методе main() вызвать полученный метод, обработать возможные исключения
 MyArraySizeException и MyArrayDataException и вывести результат расчета
 (сумму элементов, при условии, что подали на вход корректный массив).
 */
public class Task4 {
    static String[][] arr = new String[][] {
            {"1", "l", "1.5"},
            {"1", "1.5", "1.5"},
            {"g", "1.5", "h"}
    };

    public static void main(String[] args) {
        System.out.println(sum2dV2(arr));
    }

    public static double sum2d(String[][] arr) {
        if(isNotSquareArray(arr)){
            throw new MyArraySizeException();
        }
        double sum = 0;
        List<Integer[]> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Double.parseDouble(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
                
            }
        }
        return sum;
    }
    public static double sum2dV2(String[][] arr) {
        if(isNotSquareArray(arr)){
            throw new MyArraySizeException();
        }
        double sum = 0;
        List<Point2D> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Double.parseDouble(arr[i][j]);
                } catch (NumberFormatException e){
                    indexes.add(new Point2D(i, j));
                }
                
            }
        }
        if (!indexes.isEmpty()){
            throw new MyArrayDataException(indexes);
        }
        return sum;
    }
    public static boolean isNotSquareArray(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length != arr.length){
                return true;
            }
        }
        return false;
    }
}