package Java.seminars.seminar_1;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int i : array) {
            if (i == 1){
                count ++;
            }
            else{
                if(count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
            }
        
        if(count > maxCount){
                    maxCount = count;
                }
        System.out.println(maxCount); 
    }
}

