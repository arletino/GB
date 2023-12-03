package Java.exceptions;

class IsFloat {
    public static float isFloat(String input) {
// Введите свое решение ниже        
        Float temp;  
        try{
            temp = Float.parseFloat(input);
            return temp;
          }
          catch(NumberFormatException e){
          System.out.println(e);
          return Float.NaN;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class IsFloatPrinter {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
        } 
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
    
}
