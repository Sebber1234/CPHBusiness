public class ElectricCar extends ACar {

    protected int batteryCapacity;
    protected int maxRange;
    protected int power;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, int power) {
        super(registrationNumber, make, model, numberOfDoors);

        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.power = power;
    }


    public int getBatteryCapacityKWh() {

        return batteryCapacity;

    }

    public int getMaxRangeKm() {

        return maxRange;

    }

    public int getWhPrKm(){

        return power;
    }


    @Override
    public int getRegistrationFee() {
        float kml = (float)(power/91.25/100);
        if(kml > 20){
            return 330;
        }
        if(kml > 15 && kml < 20){
            return 1050;
        }
        if(kml > 10 && kml < 15){
            return 2340;
        }
        if(kml > 5 && kml < 10 ){
            return 5500;
        }
        return 10470;
    }

    @Override
    public String toString() {
        return make + " " + model + ", Battery Capcity: " + batteryCapacity + ", Max range: " + maxRange + ", WhPerKm: " + power + ". Registration number: " + registrationNumber;
    }
}