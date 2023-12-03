package Java.exceptions;
// Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум. 
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
// в качестве кода ошибки, иначе - длину массива.

public class Basic {
    public static void main(String[] args) {
        System.out.println(getLengthArray(new int[]{1, 2, 3, 5}, 5));
    }
    
    static int getLengthArray(int[] array, int minLength) {
        int length = array.length;
        if (length < minLength){
            return -1;
        }
        return length;
    }
}
