import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Runner {
    private final static String SMARTPHONES_TXT = "Smartphones.txt";


    public static void main(String[] args) throws IOException {
        PhoneScanner scanner = new PhoneScanner();
        String fileName = scanner.getFileName(SMARTPHONES_TXT);

        List<SmartPhone> phoneList = scanner.getPhoneList(fileName);

        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the Store!");

        System.out.println("Do you want to see all phones in the store yes/no?");
        String answer = console.nextLine();
        if (answer.equals("yes")) {
            for (SmartPhone phone : phoneList) {
                System.out.println(phone);
            }
        }

        System.out.println("How much dollars do you have?");
        double money = console.nextDouble();

        System.out.println("Do you have a discount card yes/no?");
        console = new Scanner(System.in);
        String newAnswer = console.nextLine();

        scanner.setDiscount(answer.equals("yes"));

        List<SmartPhone> buyList = scanner.getBuyList(phoneList, money, scanner.isDiscount());
        if (buyList.isEmpty()) {
            System.out.println("Unfortunately, you can't afford anything...");
        } else {
            System.out.println("You could buy these models:");
            for (SmartPhone phone : buyList) {
                System.out.println(phone);
            }
        }

    }

}
