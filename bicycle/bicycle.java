public class bicycle {
    private int cadence;
    private int gear;
    private float speed;

    public bicycle(int cadence, int gear, float speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    //setters or mutator

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void setSpeed(int newValue) {
        speed = newValue;
    }

    //getter or accessor

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public float getSpeed() {
        return speed;
    }

    

}
