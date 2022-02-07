import java.util.Scanner;

/*
Reverse
*/

public class Reverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int[] array;
        if (number > 0) {
            array = new int[number];
            for (int i = 0; i < number; i++) {
                array[i] = console.nextInt();
            }
            if (number % 2 == 1) {
                for (int j = 0; j < array.length; j++)
                    System.out.println(array[j]);
            } else
                for (int k = array.length - 1; k >= 0; k--) {
                    System.out.println(array[k]);
                }
        } else {
        }
    }
}
