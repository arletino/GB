package Java.exceptions.Own_exep;

import java.io.IOException;

/**
 Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 можно было работать в блоке try-with-resources. Подумайте, что должно происходить
 при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable{
    int count = 0;
    boolean status = false;
    
    public void add() {
        count++;
        status = true;
    }
    public int getCounter(){
        return count;
    }

    @Override
    public void close() throws Exception {
        if (status){
            throw new IOException("Resource is close");
        }
    }
}
