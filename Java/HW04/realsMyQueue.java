package Java.HW04;
import java.util.ArrayList;
import java.util.LinkedList;

class MyQueue<T> {
        // Напишите свое решение ниже
    private LinkedList<T> arr = new LinkedList<>();
    public void enqueue(T element){
        // Напишите свое решение ниже
        arr.addLast(element);
    }

    public T dequeue(){
        // Напишите свое решение ниже
        
        return arr.removeFirst();
    }

    public T first(){
        // Напишите свое решение ниже
        return arr.get(0);
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return arr;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class realsMyQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}

