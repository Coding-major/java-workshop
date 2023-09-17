// topic covered include (1) how to use nested classes and instantiating it.
public class nestedclass {
    class Parent {
        void display() {
            System.out.println("Parent's display method");
        }
    }
    
    class Child extends Parent {
        //Override
        void display() {
            super.display(); // Calling the overridden method in the superclass
            System.out.println("Child's display method");
        }
    }

    public static void main(String[] args) {
        nestedclass access = new nestedclass(); // created an instance of the outer class so that the innerclass can work
        Child child = access.new Child();
        child.display(); // Invoking the overridden method in the Child class
    }

}