/*

1. Поле array класса RandomNumbersForArray нужно проинициализировать значением двумерного массива целых чисел размерностью 2х3.
2. Этот массив необходимо заполнить любыми целыми числами, кроме 0.
3. В программе нужно вывести элементы массива, каждый элемент с новой строки.

 */

public class RandomNumbersForArray {


    public static int[][] array = new int[2][3];

    public static int getRandomDiceNumber() {
        return (int) ((Math.random() * 10) + 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomDiceNumber();
                System.out.println(array[i][j]);
            }
        }
    }
}
