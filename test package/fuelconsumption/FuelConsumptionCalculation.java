package fuelconsumption;

public class FuelConsumptionCalculation {
    private double fuelConsumptionOldRegulation = 0;
    private double fuelConsumptionNewRegulation = 0;
    private SimpleCar[] cars;
    
    public FuelConsumptionCalculation() {
        final int MAX_CARS = 4;
        cars = new SimpleCar[MAX_CARS];
        cars[0] = new DeluxeCar("Honda", 14f, 10.5f);
        ((DeluxeCar)cars[0]).setDistance(7, 18, 300, 10);
        cars[1] = new AdvancedCar("Toyota", 15.5f, 9.5f);
        ((AdvancedCar)cars[1]).setDistance(7, 18, 200);
        cars[2] = new SimpleCar("Nissan", 13.0f);
        cars[2].setDistance(350);
        cars[3] = new DeluxeCar("Van (Nissan)", 10.5f, 6f);
        ((DeluxeCar)cars[3]).setDistance(7,18,400, 7);
      
        calculateFuelconsumption();
    }

    public FuelConsumptionCalculation(SimpleCar[] cars) {
        this.cars = cars;
        calculateFuelconsumption();
    }
    
    private void calculateFuelconsumption() {
        fuelConsumptionOldRegulation = 0;
        fuelConsumptionNewRegulation = 0;
        for (int i = 0; i < cars.length ; i++) {
            fuelConsumptionOldRegulation +=
            cars[i].calculateFuelConsumptionOldRegulations();
            fuelConsumptionNewRegulation +=
            cars[i].calculateFuelConsumptionNewRegulations();
        }
    }

    
    public double getOldFuelConsumption() {
        return fuelConsumptionOldRegulation;
    }

    public double getNewFuelConsumption() {
        return fuelConsumptionNewRegulation;
    }
    public static void main(String[] args) {
        FuelConsumptionCalculation f = new FuelConsumptionCalculation();
                System.out.println("Total fuel consumption for old & new regulation: " + f.getNewFuelConsumption() + f.getOldFuelConsumption());
                System.out.println("Difference between old & new regulation: " + (f.getOldFuelConsumption() - f.getNewFuelConsumption()) );
    }
}
