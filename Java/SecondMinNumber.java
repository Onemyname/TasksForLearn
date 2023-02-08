/*
Второе минимальное число из введенных
*/

public class SecondMinNumber {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int min = console.nextInt();
        int secondMin = console.nextInt();

        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }

        while (console.hasNextInt()) {
            int newNumber = console.nextInt();

            if (min == secondMin) {
                if (newNumber > min) {
                    secondMin = newNumber;
                } else if (newNumber < min) {
                    min = newNumber;
                }
            } else if (newNumber < min) {
                secondMin = min;
                min = newNumber;
            }
            else if (newNumber>min && newNumber<secondMin){
                secondMin=newNumber;

            }
        }
        System.out.println(secondMin);
    }
}
