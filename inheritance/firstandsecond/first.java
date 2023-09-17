class first {
    private String cars;
    private String house;
    private String estates;
    private int happinessLevel;

    public first(String cars, String house, String estates) {
        this.cars = cars;
        this.house = house;
        this.estates = estates;
        this.happinessLevel = 100;
    }


    // getters
    public String getCars() {
        return cars;
    }

    public String gethouse() {
        return house;
    }

    public String getEstates() {
        return estates;
    }

    public int getHappiness() {
        return happinessLevel;
    }

}
