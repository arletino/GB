package Java.HW03;
import java.util.Arrays;

class MergeSort {
    public static void merge(int[] a, int lb, int m, int rb) {
        // Напишите свое решение ниже
    int n1 = m - lb + 1;
    int n2 = rb -m;
    int l[] = new int[n1];
    int r[] = new int[n2];
    for (int i = 0; i < n1; i++) {
        l[i] = a[lb + i];
    }
    for (int j = 0; j < n2; j++) {
        r[j] = a[m + 1 + j];
    }
    int i = 0, j = 0, k = lb;
    while (i < n1 && j < n2) {
        if (l[i] <= r[j]){
            a[k] = l[i];
            i++; 
        }
        else{
            a[k] = r[j];
            j++;
        }
        k++;
    }
    while (i < n1) {
        a[k] = l[i];
        i++;
        k++;   
    }
    while (j < n2) {
        a[k] = r[j];
        j++;
        k++;   
    }
    }
    public static void sort(int a[], int l, int r) {
        if(l < r){
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m+1, l);

            merge(a, l, m, r);
        }
    }
    public static int[] mergeSort(int[] a) {
        sort(a, 0, a.length-1);
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task1{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
