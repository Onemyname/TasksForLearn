import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Бриллианты");
        hashMap.put(2, "Сушеная крыса");
        hashMap.put(3, "Алмазы");
        hashMap.put(4, "Доллары");
        printHashMap(hashMap);
        printHashMapWithEntry(hashMap);

        containsValue(hashMap, "Облигации");
        containsValue(hashMap, "Сушеная крыса");


    }

    public static void printHashMap(HashMap hashMap) {
        for (var value : hashMap.keySet()
        ) {
            System.out.println("Ключ мапы:" + value + " Значение ключа: " + hashMap.get(value));
        }
        System.out.println();
    }

    public static void printHashMapWithEntry(HashMap<Integer,String> hashMap){
        for (Map.Entry<Integer,String> pair: hashMap.entrySet()) {
            Integer key = pair.getKey();
            String putThings = pair.getValue();
            System.out.println("Ключ мапы:" + key + " Значение ключа: " +putThings);
        }
        System.out.println();
    }
    public static void containsValue(HashMap hashMap, String value){
        System.out.println("Содержит ли данная HashMap значение: " + value + "?"+ '\n' + "Проверяем...");
        String result = hashMap.containsValue(value)? "Да, данная HashMap содержит значение: " + value:  "Нет, данная HashMap не содержит значение: " + value;
        System.out.println(result+'\n');

    }
}
