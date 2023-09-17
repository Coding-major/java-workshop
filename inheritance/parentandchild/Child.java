//topic covered include (1) how to invoke an overridden method or variable in the subclass
class Child extends Parent {
    String name = "mustey";  //override 
    //Override
    void display() {
        super.display(); // Calling the overridden method in the superclass
        System.out.println("Child's display method");
        System.out.println(super.name); // accessing a hidden variabll(an overidden variable)
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Invoking the overridden method in the Child class
    }
}


    
