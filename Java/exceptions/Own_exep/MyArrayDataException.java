package Java.exceptions.Own_exep;

import java.util.List;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j){
        super(String.format("В ячейке [%s][%s] не число",i, j));
    }

    public MyArrayDataException(List<Point2D> points){
        super(String.format("В ячейках: %s не числа ", points));
    }
}
