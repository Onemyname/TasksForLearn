import java.util.Scanner;

public class TryToWalkDog {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Как зовут вашу собаку?");
        String nameDog = console.nextLine();
        Dog dog = new Dog(nameDog);
        System.out.println("Вы надели ошейник?");
        String answer = console.nextLine();
        if (answer.equalsIgnoreCase("да")){
            dog.putCollar();
        }
        System.out.println("Вы надели поводок?");
        answer = console.nextLine();
        if (answer.equalsIgnoreCase("да")){
            dog.putLeash();
        }
        System.out.println("Вы надели намордник?");
        answer = console.nextLine();
        if (answer.equalsIgnoreCase("да")){
            dog.putMuzzle();
        }
        try {
            dog.walk();
        }
        catch(Dog.DogIsNotReadyToWalkException e){
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение...");
            StringBuilder result = new StringBuilder(dog.isCollarPutOn == true ? "Ошейник надет" : "Ошейник не надет");
            System.out.println(result);
            result = new StringBuilder(dog.isLeashPutOn == true ? "Поводок надет" : "Поводок не надет");
            System.out.println(result);
            result = new StringBuilder(dog.isMuzzlePutOn == true ? "Намордник надет" : "Намордник не надет");
            System.out.println(result);
        }
    }
}
class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }
    public void putCollar(){
        System.out.println("Ошейник надет!");
        this.isCollarPutOn = true;
    }
    public void putLeash(){
        System.out.println("Поводок надет!");
        this.isLeashPutOn=true;
    }
    public   void putMuzzle(){
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyToWalkException{
        System.out.println("Собираемся на прогулку!");
        if(this.isMuzzlePutOn == true && this.isLeashPutOn == true && this.isCollarPutOn == true){
            System.out.println("Ура, идем гулять, " + this.name+"!");
        }
        else{
            throw new DogIsNotReadyToWalkException("Собака " + this.name + " не готова к прогулке! Проверьте экипировку!");
        }
    }


    public class DogIsNotReadyToWalkException extends Exception {

        public DogIsNotReadyToWalkException(String message) {
            super(message);
        }
    }
}