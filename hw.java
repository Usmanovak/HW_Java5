import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class hw {
    /* Реализуйте структуру телефонной книги с помощью HashMap.
    Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
    их необходимо считать, как одного человека с разными телефонами. 
    Вывод должен быть отсортирован по убыванию числа телефонов. */
    
    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Pall", 123, bookPhone);
        addNumber("Kerry", 456, bookPhone);
        addNumber("Artur", 789, bookPhone);
        addNumber("Sasha", 101, bookPhone);
        addNumber("Kerry", 102, bookPhone);
        addNumber("Artur", 919, bookPhone);
        printBook(bookPhone);
       }


    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + " ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
