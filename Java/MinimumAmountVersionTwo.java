import java.util.Scanner;

/*
Минимальная сумма
В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3. В методе main нужно заполнить построчно этот массив данными с клавиатуры, посчитать сумму элементов в каждом столбце и в каждой строке и вывести наименьшую из этих сумм на экран.


Requirements:
1. В программе нужно считывать 9 чисел с клавиатуры.
2. Массив array необходимо заполнить числами, введенными с клавиатуры.
3. В программе нужно вывести на экран минимальную сумму элементов в строке или столбце.
*/

public class MinimumAmountVersionTwo {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {

        int counter = 0;
        int min = Integer.MAX_VALUE;

        Scanner console = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {  // создание массива
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = console.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {   // по строкам
            for (int j = 0; j < array[i].length; j++) {
                counter += array[i][j];
            }
            min = Math.min(counter, min);
            counter = 0;
        }

        for (int i = 0; i < array.length; i++) {   // по cтолбцам
            for (int j = 0; j < array[i].length; j++) {
                counter += array[j][i];
            }
            min = Math.min(counter, min);
            counter = 0;
        }
        System.out.println(min);
    }
}
}
