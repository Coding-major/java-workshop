//we covered (1) we looked deeper into over riding

class Animal {
    public static void sound() {
        System.out.println("This is an animal");
    }

    public void noise() {
        System.out.println("Animals make noise");
    }
}

public class Cat extends Animal{
    public static void sound() {
        System.out.println("Cats makes good sound");
    }

    public void noise() {
        System.out.println("Does Cats makes noise");
    }

    public static void main(String[] main) {
        Animal test1 = new Cat();
        Animal test2 = new Animal();
        Cat test3 = new Cat();

        test1.sound();
        test2.sound();
        test3.sound();
        System.out.println("////////////////");
        test1.noise();
        test2.noise();
        test3.noise();
    }
}
