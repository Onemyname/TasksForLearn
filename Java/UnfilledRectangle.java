public class UnfilledRectangle {
    public static void main(String[] args) {
        int widht = 0;
        while (widht<10){
            int n = 0;
            if (widht==0 || widht==9) {
                while (n<20){
                    System.out.print("Б");
                    n++;
                }
                widht++;
                System.out.println("");
                continue;
            }
            else {
                while (n<20){
                    if (n==0 || n==19){
                        System.out.print("Б");
                        n++;
                    }
                    else {
                        System.out.print(" ");
                        n++;
                    }
                }
                widht++;
                System.out.println("");
                continue;
            }
        }
    }
}

