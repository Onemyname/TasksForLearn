import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] stringArray = new String[5];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = console.nextLine();
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        int sum = 0;
        for (String x : stringArray) {
            int y = Integer.parseInt(x);
            sum = sum + y;

        }
        System.out.print(sum);
    }
}
