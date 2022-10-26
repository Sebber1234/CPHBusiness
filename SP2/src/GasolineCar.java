public class GasolineCar extends AFuelCar {


    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int km) {
        super(registrationNumber, make, model, numberOfDoors, km);
    }

    public String getFuelType() {
        return "Gasoline";
    }

    public int getRegistrationFee() {
        if(kmPrLitre > 20){
            return 330;
        }
        if(kmPrLitre > 15 && kmPrLitre < 20){
            return 1050;
        }
        if(kmPrLitre > 10 && kmPrLitre < 15){
            return 2340;
        }
        if(kmPrLitre > 5 && kmPrLitre < 10 ){
            return 5500;
        }
        return 10470;
    }

    @Override
    public String toString() {
        return make + " " + model + ", Fuel type: " + getFuelType() + ". Registration number: " + registrationNumber;
    }
}