import java.util.Scanner;

/*
Создаем двумерный массив
*/
public class TwoDimensionalArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        multiArray = new int[number][];
        for (int i = 0; i < number; i++) {
            int lineOfArray = console.nextInt();
            multiArray[i] = new int[lineOfArray];
        }
    }
}
