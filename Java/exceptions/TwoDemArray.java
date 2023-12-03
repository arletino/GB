package Java.exceptions;

import java.util.Arrays;

public class TwoDemArray {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };
        System.out.println(calculateArrayElementsSum(ints));
    }
    public static int calculateArrayElementsSum(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i].length != ints.length) {
                throw new RuntimeException("Не квадратный массив :( ");
            }
        }
        if (Arrays.stream(ints).anyMatch(arr -> arr.length != ints.length)){
            throw new RuntimeException("Не квадратный массив :( ");
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
               sum += ints[i][j];
            }
        }
        return sum;
    }
}

