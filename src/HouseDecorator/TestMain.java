public class TestMain {
    public static void main(String[] args) {


        House brickHouse = new BrickHouse(); // обычный одноэтажный кирпичный дом
        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());

        System.out.println("_____________________________________________________");

        House woodenHouse = new WoodenHouse(); // обычный одноэтажный деревянный дом
        System.out.println(woodenHouse.getInfo());
        System.out.println("Цена: "  + woodenHouse.getPrice());

        System.out.println("_____________________________________________________");

        House brickHouseWithSecondFloor = new BrickHouse(); // кирпичный двухэтажный дом
        brickHouseWithSecondFloor = new SecondFloor(brickHouseWithSecondFloor);
        System.out.println(brickHouseWithSecondFloor.getInfo());
        System.out.println("Цена: "  + brickHouseWithSecondFloor.getPrice());

        System.out.println("_____________________________________________________");

        House woodenHouseWithSecondFloor = new WoodenHouse(); // деревянный двухэтажный дом
        woodenHouseWithSecondFloor = new SecondFloor(woodenHouseWithSecondFloor);
        System.out.println(woodenHouseWithSecondFloor.getInfo());
        System.out.println("Цена: "  + woodenHouseWithSecondFloor.getPrice());

        System.out.println("_____________________________________________________");

        House brickHouseWithSecondFloorAndGarage = new SecondFloor(new Garage(new BrickHouse())); // кирпичный двухэтажный дом с гаражом
        System.out.println(brickHouseWithSecondFloorAndGarage.getInfo());
        System.out.println("Цена: " + brickHouseWithSecondFloorAndGarage.getPrice());

        System.out.println("_____________________________________________________");

        House woodenHouseWithSecondFloorAndGarage = new SecondFloor(new Garage(new WoodenHouse()));
        System.out.println(woodenHouseWithSecondFloorAndGarage.getInfo());
        System.out.println("Цена: " + woodenHouseWithSecondFloorAndGarage.getPrice());

    }
}
