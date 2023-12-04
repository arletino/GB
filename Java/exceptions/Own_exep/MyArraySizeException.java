package Java.exceptions.Own_exep;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(){
        super("Размер не 3х3 ");
    }
}
