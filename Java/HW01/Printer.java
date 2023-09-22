package Java.HW01;

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 1; i < 1001; i++) {
            if (checkPrime(i) == true){
                System.out.println(i);
            }
        }
    }
    public Boolean checkPrime(int n){
        for (int i = 2; i < (n / 2 +1); i++) {
            if (n % i == 0){
                return false;
            }    
        }
        return true;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}
