abstract class Animal {
    private String name;

    public Animal (String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public abstract void sound();
}

class Cow extends Animal {
    public Cow(String Name) {
        super(Name);
    }

    public void sound() {
        System.out.println(getName()+" is vum vum vum");
    }
}

class Cat extends Animal {
    public Cat(String Name) {
        super(Name);
    }

    public void sound() {
        System.out.println(getName()+" is meow moew");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal[] anims = new Animal[]
    }
}

