package Java.exceptions;

public class NumberFormat {
    public static void main(String[] args) {
        try {
            Integer str = new Integer("A");    
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Integer str = new Integer.parseInt("A");    
        } catch (Exception b) {
            System.out.println(b);
        }

        
    }
}
