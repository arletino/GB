package Java.HW05;

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
           // Введите свое решение ниже
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            int lage = i;
            int l = 2 * i + 1;   
            int r = 2 * i + 2;
            if (l < sortLength && tree[l] > tree[lage]){
                lage = l;
            }
            if (r < sortLength && tree[r] > tree[lage]){
                lage = r;
            }
            if (lage != i) {
                int swap = tree[i];
                tree[i] = tree[lage];
                tree[lage] = swap;
                buildTree(tree, sortLength);
            }
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
        for (int i = sortLength-1; i >= 0; i--) {
            buildTree(sortArray, i);
            int swap = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = swap;
        }
    }
}

// Не удаляйте и не меняйте метод Main! 
public class heapsort {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 22, 14, 5, 28, 11, 7};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
