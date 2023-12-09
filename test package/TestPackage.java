import fuelconsumption.*;

public class TestPackage {
    
    public static void main(String[] args) {
    
        SimpleCar[] cars;
        FuelConsumptionCalculation d;

        final int MAX_CARS = 5;
        cars = new SimpleCar[MAX_CARS];
        cars[0] = new DeluxeCar("Honda", 14f, 10.5f);
        ((DeluxeCar)cars[0]).setDistance(7, 18, 300, 10);
        cars[1] = new AdvancedCar("Toyota", 15.5f, 9.5f);
        ((AdvancedCar)cars[1]).setDistance(7, 18, 200);
        cars[2] = new SimpleCar("Nissan", 13.0f);
        cars[2].setDistance(350);
        cars[3] = new DeluxeCar("Van (Nissan)", 10.5f, 6f);
        ((DeluxeCar)cars[3]).setDistance(7,18,400, 7);
        cars[4] = new BusTaxi("Mercedes", 6.6f, 11.5f);
        ((BusTaxi)cars[4]).setDistance(7, 18, 200, 10, 10);

        d = new FuelConsumptionCalculation(cars);

        System.out.println("Fuel Consumption of the Old regulations: " + d.getOldFuelConsumption() + " litres");        
        System.out.println("Fuel Consumption of the New regulations: " + d.getNewFuelConsumption() + " litres");        
        System.out.println("The Fuel Saved: " + (d.getOldFuelConsumption() - d.getNewFuelConsumption() + " litres"));



    }
}
