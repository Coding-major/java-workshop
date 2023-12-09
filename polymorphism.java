class first {
    public void display() {
        System.out.println("first of all");
    }
}

class second extends first {
    public void display() {
        System.out.println("Secondly al is well");
    }

    public void print() {
        System.out.println("opoooooooooooooor");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        first f1 = new second();
        f1.display();
        f1.print();
    
    }
}