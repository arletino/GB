// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package JavaCore.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class programm {
    public static void main(String[] args) {
        Integer[] array = new Integer[1000]; 
        fillArray(array);
        System.out.println("Array");
        System.out.println(Arrays.toString(array));
        System.out.println("Result");
        System.out.println(unic(array));
    }
    
    public static void fillArray(Integer[] args) {
        for (int i = 0; i < args.length; i++) {
            Random random = new Random();
            args[i] = random.nextInt(0, 25);
        }
    }
    public static double unic(Integer[] args){
        Set<Integer> unic = new HashSet<>(Arrays.asList(args));
        System.out.println("Set");
        System.out.println(unic);
        double result = unic.size() * 100.0 / args.length; 
        return result;
    }
}
