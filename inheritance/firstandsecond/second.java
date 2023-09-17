// topics covered include (1) how to use super() in a subclass constructor, (2) casting(both implicit and explicit).
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