package Java.exceptions;

/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][] {
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1"},
            {"1", "1", "1", "1", "1"},
            {"1", "1", "1", "1", "1"}
    };
    System.out.println(sum2d(arr0));
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        } catch (NumberFormatException e){
            System.err.println("В массиве не число");
        } catch (ArrayIndexOutOfBoundsException e){
            return sum2d(checkSize(arr));
        }
        return sum;
    }
    private static String[][] checkSize(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            String[] elem = arr[i];
            if (elem.length > arr.length){
                throw new RuntimeException("array is not square");
            } 
            if(elem.length < arr.length){
                String[] temp = new String[arr.length];
                System.arraycopy(elem, 0, temp, 0, elem.length);
                for (int j = elem.length; j < arr.length; j++) {
                    temp[j] = "0";
                }
                elem = temp;
                arr[i] = elem;
            } 
        }
        return arr;
    }
}
