package Java.JavaCore.seminar_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        // for(int i = arr.length -1; i >=0; i--){
        //     System.out.println(arr[i] + " ");
        // }
    List<String> strg = Arrays.asList(arr);
    Collections.reverse(strg);
    System.out.println(strg);
    }
}
