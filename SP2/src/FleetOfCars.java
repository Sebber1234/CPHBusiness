import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotal(){
        return fleet.size();
    }

    public  int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for (Car c : fleet){
            sum += c.getRegistrationFee();
        }
        return sum;
    }
    @Override
    public String toString() {
        String _return = "The fleet of cars is " + getTotal() + " large.\n";
        for (Car car:fleet) {
            _return += car + "\n";
        }
        _return += "Total registration fee for fleet is " + getTotalRegistrationFeeForFleet();
        return _return;
    }
}