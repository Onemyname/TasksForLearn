import java.util.HashSet;
import java.util.Iterator;
public class HashSetMethodsTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Привет");
        hashSet.add("Пока");
        hashSet.add("До побачення");
        hashSet.add("Доброго ранку");
        System.out.println("Заполненное множество HashSet:");
        for (String hashSetValue : hashSet) {
            System.out.println(hashSetValue);
        }
        System.out.println("_______________________");

        Iterator<String> iterator = hashSet.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            System.out.println("Элемент № " + count + ":" + iterator.next());
            iterator.remove();
            count++;
        }
        System.out.println("_______________________");
        System.out.println("Проверка наличия элементов перебором foreach после удаления:");

        for (String hashSetValue : hashSet) {
            System.out.print(hashSetValue + " ");
        }
        if (iterator.hasNext() == false) {
            System.out.println("В множестве не осталось элементов");
        }
    }
}
