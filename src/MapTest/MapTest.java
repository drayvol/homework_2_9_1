package MapTest;

import java.util.HashMap;
import java.util.Map;
public class MapTest {
    private static final Map<String, Integer> map = new HashMap<>();
    public static void main(String []args){
        addNumber("строка 1", 1);
        addNumber("строка 1", 2);
        addNumber("строка 2", 3);
        addNumber("строка 2", 4);
        for (Map.Entry<String,Integer> stringIntegerEntry:map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+" : "+ stringIntegerEntry.getValue());

        }
    }

    public static void addNumber(String s, Integer i){
        if(map.containsKey(s)&&map.containsValue(i)) throw new RuntimeException("Такой элемент уже есть");
        map.put(s,i);
    }
}
