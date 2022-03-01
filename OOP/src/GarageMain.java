public class GarageMain {
    // pass object as argument
    public static void main(String[] args) {

        Garage garage = new Garage();
        Bike bike1 = new Bike("My bike");
        SecondCar car1 = new SecondCar("BMW");
        SecondCar car2 = new SecondCar("Tesla");
        garage.park(car1);
        garage.park(car2);
        garage.noPark(bike1);



    }
}
