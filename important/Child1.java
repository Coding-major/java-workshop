class Parent {
    public static void myStaticMethod() {
        System.out.println("A");
    }
    public void myInstanceMethod() {
        System.out.println("B");
    }
} // End of the Parent class
    
public class Child1 extends Parent {
    public static void myStaticMethod() {
        System.out.println("C");
    }
    public void myInstanceMethod() {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Parent o1 = new Parent();
        Parent o2 = new Child();
        Child o3 = new Child();

        if(o1 instanceof Child) {
            System.out.println("yes");
        } else {
            System.out.println("no no no no");
        }

        // Parent.myStaticMethod(); // A
        // Child.myStaticMethod(); // C
        // o1.myStaticMethod(); // A
        // o1.myInstanceMethod(); // B
        // o2.myStaticMethod(); // A
        // o2.myInstanceMethod(); // D
        // o3.myStaticMethod(); // C
        // o3.myInstanceMethod(); // D
        // myStaticMethod(); // C
        //myInstanceMethod();// Compiler Error
    } // End
}
