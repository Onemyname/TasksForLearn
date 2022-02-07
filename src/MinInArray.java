import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class MinInArray {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        array = new int[number];
        for (int a = 0; a < array.length; a++) {
            array[a] = console.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = array[i]<min? array[i]: min;
        }
        System.out.println(min);
    }
}
}

