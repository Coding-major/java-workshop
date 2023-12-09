import fuelconsumption.*;

class BusTaxi extends DeluxeCar{
    private int minimunNumberOfPassengers = 0;

    public BusTaxi(String maker, float fuelEconomy, float acFuel){
        super(maker, fuelEconomy, acFuel);
    }

    public void setDistance(int beginWork, int endWork, int distance, int timeWIthPassengers, int minimumNumberPassengers){
        super.setDistance(beginWork, endWork, distance, timeWIthPassengers);
        this.minimunNumberOfPassengers = minimumNumberPassengers;
    }  
    public float calculateFuelConsumptionOldRegulations(){
        return getDistance() / getfuelEconomy() + (getEndWork() - getBeginWork()) / (getAcFuel() / minimunNumberOfPassengers);
    } 
    public float calculateFuelConsumptionNewRegulations(){
        return getDistance() / getfuelEconomy() + getTimeWithPassengers() / (getAcFuel() / minimunNumberOfPassengers);

    }
}
