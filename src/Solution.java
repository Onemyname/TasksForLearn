import java.util.Locale;
import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String password = console.nextLine();
        String result = secret.toLowerCase().equals(password.toLowerCase()) ? "доступ разрешен" : "доступ запрещен";
        System.out.println(result);

    }
}