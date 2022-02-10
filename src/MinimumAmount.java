import java.util.Scanner;

/*
Минимальная сумма
В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3. В методе main нужно заполнить построчно этот массив данными с клавиатуры, посчитать сумму элементов в каждом столбце и в каждой строке и вывести наименьшую из этих сумм на экран.


Requirements:
1. В программе нужно считывать 9 чисел с клавиатуры.
2. Массив array необходимо заполнить числами, введенными с клавиатуры.
3. В программе нужно вывести на экран минимальную сумму элементов в строке или столбце.
*/

public class MinimumAmount {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {

        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;

        Scanner console = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = console.nextInt();
                if (array[i][j] == array[0][j]) {
                    sum0 = sum0 + array[i][j];
                } else if (array[i][j] == array[1][j]) {
                    sum1 = sum1 + array[i][j];
                } else {
                    sum2 = sum2 + array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == array[i][0]) {
                    sum3 = sum3 + array[i][j];
                } else if (array[i][j] == array[i][1]) {
                    sum4 = sum4 + array[i][j];
                } else {
                    sum5 = sum5 + array[i][j];
                }
            }
        }
        int minSum = sum0 <= sum1 ? sum0 : sum1;
        minSum = minSum <= sum2 ? minSum : sum2;
        minSum = minSum <= sum3 ? minSum : sum3;
        minSum = minSum <= sum4 ? minSum : sum4;
        minSum = minSum <= sum5 ? minSum : sum5;
        System.out.println(minSum);
    }
}
