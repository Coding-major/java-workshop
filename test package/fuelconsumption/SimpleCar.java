package fuelconsumption;

public class SimpleCar {
    private String maker; // Honda Toyota, Nissan, etc.
    private int distance = 0; // distance travelled
    private float fuelEconomy; 

    public SimpleCar(String maker, float fuelEconomy) {
    this.maker = maker;
    this.fuelEconomy = fuelEconomy;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getMaker() {
        return maker; 
    }

    public int getDistance() { 
        return distance; 
    }

    public float getfuelEconomy() { 
        return fuelEconomy; 
    }

    public float calculateFuelConsumptionOldRegulations() {
        return distance / fuelEconomy;
    }

    public float calculateFuelConsumptionNewRegulations() {
        float r = calculateFuelConsumptionOldRegulations();
        return r;
    }

}
