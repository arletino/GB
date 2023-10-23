package Java.HW02;


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder result = new StringBuilder(QUERY);
        String[] tmp = PARAMS.substring(1, PARAMS.length()-2).replace(" ", "").split(",");
        String [] temp;
        for (String field : tmp) {
            temp = field.replace("\"", "").split(":");
            if (!temp[1].equals("null")){
            result.append(String.format("%s='%s'", temp[0], temp[1] ));
            result.append(" and ");
            }
        }
        
        
        return result.delete(result.lastIndexOf(" and "), result.length()-1);
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task1{ 
	public static void main(String[] args) { 
      String QUERY = "";
      String PARAMS = "";
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        QUERY = "select * from students where ";
	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
      }
      else{
        QUERY = args[0];
        PARAMS = args[1];
      }     
      
      Answer ans = new Answer();      
      System.out.println(ans.answer(QUERY, PARAMS));
	} 
}
