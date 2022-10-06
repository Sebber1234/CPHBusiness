package Task1;

public class Main {


    public static void main(String[] args) {
        Driver jack = new Driver("Jack", 20);

        Car impala = new Car("Chevrolet", "Impala", 1967, "hardtop Sedan");
        impala.setDriver(jack);

        Car mustang = new Car("Ford", "Mustang", 1967, "Hardtop Sedan");
        mustang.setDriver(jack);

        System.out.println(impala + "" + impala.getDriver());
        System.out.println(mustang + "" + mustang.getDriver());
    }


}
