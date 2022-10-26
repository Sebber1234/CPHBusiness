public class Main {

    public static void main(String[] args) {
        Car c1 = new GasolineCar("BD1257134342", "BMW", "M3 2016", 5, 15);
        Car c2 = new DieselCar("CFGFYHW9921340", "Toyota", "Supra 1998", 3, 12, false);
        Car c3 = new ElectricCar("GA0TWRT19243", "Audi", "A2 2016", 4, 1500, 100, 8);

        FleetOfCars adamsFleet = new FleetOfCars();
        adamsFleet.addCar(c1);
        adamsFleet.addCar(c2);
        adamsFleet.addCar(c3);
        System.out.println(adamsFleet);
    }
}