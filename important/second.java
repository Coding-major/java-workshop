// topics covered include (1) how to use super() in a subclass constructor, (2) casting(both implicit and explicit).
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

class second extends first {
    private String computers;
    private String phones;

    public second (String carm, String house, String estates, String computers, String phones) {
        super(carm, house, estates);
        this.computers = computers;
        this.phones = phones;
    }

    public static void main (String[] args) {

        //object casting

        //implicit casting
        first property1 = new second("camry", "bungalow", "three", "lenovo", "samsung");

        // explicit casting
        second property2 = (second)property1;

        System.out.println(property1.phones); // wrong
        System.out.println(property1.cars); // field not visible

        System.out.println(property2.phones); // correct

        // to avoid run-time error
        if (property1 instanceof second) {
            second property3 = (second)property1; 
        }

    }
}