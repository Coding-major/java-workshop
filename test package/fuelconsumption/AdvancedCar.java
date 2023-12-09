package fuelconsumption;

public class AdvancedCar extends SimpleCar {
    private float acFuel; 
    private int beginWork = 0; // time to begin work
    private int endWork = 0; // time to end work

    public AdvancedCar(String maker, float fuelEconomy, float acFuel) {
        super(maker, fuelEconomy);
        this.acFuel = acFuel;
    }

    public void setDistance(int beginWork, int endWork, int distance) {
        super.setDistance(distance);
        this.beginWork = beginWork;
        this.endWork = endWork;
    }

    public float getAcFuel() {
         return acFuel; 
    }

    // public float getEndWork() {
    //      return endWork; 
    // }

    // public float getBeginWork() {
    //      return beginWork; 
    // }

    public float calculateFuelConsumptionOldRegulations() {
        float r = super.calculateFuelConsumptionOldRegulations() + (endWork - beginWork) / acFuel;
        return r;
    }
    public float calculateFuelConsumptionNewRegulations() {
        float r = calculateFuelConsumptionOldRegulations();
        return r;
    }
}

