import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MethodsOfCollections {
    public static void main(String[] args) {
        ArrayList<String> arrayListFirst = new ArrayList<>();
        ArrayList<String> arrayListSecond = new ArrayList<>();
        ArrayList<Integer> arrayListThird = new ArrayList<>();

        Collections.addAll(arrayListFirst, "ПРИВЕТ", "ПОКА", "ДРАТУТИ", "ДАСВИДАНЯ");
        Collections.addAll(arrayListSecond, "привет", "пока", "дратути", "дасвиданя", "доброго ранку");
        Collections.addAll(arrayListThird, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        printArray(arrayListFirst);
        printArray(arrayListSecond);
        printArray(arrayListThird);

        Collections.fill(arrayListThird, 1);
        printArray(arrayListThird);

        Collections.shuffle(arrayListFirst);
        printArray(arrayListFirst);

        arrayListThird.add(-12);
        arrayListThird.add(100);

        printArray(arrayListThird);
        System.out.println(Collections.min(arrayListThird));
        System.out.println(Collections.max(arrayListThird));

        Collections.sort(arrayListThird);
        printArray(arrayListThird);

        Collections.replaceAll(arrayListThird, 1, 7);
        printArray(arrayListThird);

        System.out.println(Collections.frequency(arrayListThird, 7));

        System.out.println(Collections.binarySearch(arrayListThird, -12));

        System.out.println(Collections.disjoint(arrayListFirst, arrayListSecond));

        Collections.reverse(arrayListThird);
        printArray(arrayListThird);

        System.out.println(Collections.nCopies(3, arrayListFirst));
    }

    public static void printArray(ArrayList arrayList) {
        for (var outLine : arrayList
        ) {
            System.out.print(outLine + " ");
        }
        System.out.println();
    }
}

