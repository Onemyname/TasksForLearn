public class Car {
    public static void main(String[] args) {
        Car sportCar = new Car();
    }

    public Car() {
Door door = new Door();
        System.out.println("А затем машина!");
    }

    class Door {
public Door(){
    System.out.println("Дверь создана!");
}
    }


}