public class Car {

    Door door1;
    Door door2;
    Door door3;
    Door door4;

    Engine engine;

    public double getHeight() {
        return height;
    }

    private double height;

    public static void main(String[] args) {
        Car sportCar = new Car(1.5);
        String heightCar = "Высота машины = ";
        String heightDoor = "Высота двери автомобиля № 1 = ";
        String enginePower = "Количество лошадиных сил двигателя = ";
        System.out.println(heightCar + sportCar.getHeight() + " м");
        System.out.println(heightDoor + sportCar.door1.getDoorHeight() + " м");
        System.out.println(enginePower + sportCar.engine.getHorsePower() + " л/c");
    }

    public Car(double height) {
        this.height = height;
        Door door1 = new Door();
        Door door2 = new Door();
        Door door3 = new Door();
        Door door4 = new Door();
        this.door1 = door1;
        this.door2 = door2;
        this.door3 = door3;
        this.door4 = door4;

        Engine engine = new Engine(250);
        this.engine = engine;
        System.out.println("А затем машина!");
    }

    protected class Door {
        public double getDoorHeight() {
            return doorHeight;
        }

        private double doorHeight;

        public Door() {
            doorHeight = getHeight() * 0.5;
            System.out.println("Дверь создана!");

        }

    }

    protected class Engine {
        public int getHorsePower() {
            return horsePower;
        }

        private int horsePower;

        public Engine(int horsePower) {
            System.out.println("Двигатель создан!");
            this.horsePower = horsePower;
        }
    }

}