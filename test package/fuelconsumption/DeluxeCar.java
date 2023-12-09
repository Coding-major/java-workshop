package fuelconsumption;

public class DeluxeCar extends AdvancedCar {
    private int timeWithPassengers = 0;
    public DeluxeCar(String maker, float fuelEconomy, float acFuel) {
        super(maker, fuelEconomy, acFuel);
    }

    public void setDistance(int beginWork, int endWork, int distance, int timeWithPassengers) {
        super.setDistance(beginWork, endWork, distance);
        this.timeWithPassengers = timeWithPassengers;
    }

    public float getTimeWithPassengers(){
        return timeWithPassengers;
    }

    public float calculateFuelConsumptionOldRegulations() {
        float r = super.calculateFuelConsumptionOldRegulations();
        return r;
    }

    public float calculateFuelConsumptionNewRegulations() {
        return getDistance() / getfuelEconomy() + timeWithPassengers / getAcFuel();
    }
}

