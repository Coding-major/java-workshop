class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }

    public Shape() {
        name = "no name";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getClass().getName() + " " + name;
    }

}

class Circle extends Shape {
    private float radius;

    public Circle(String name, float radius) {
        super(name);
        this.radius = radius;
    }

}

class Rectangle extends Shape {
    private float length;
    private float breadth;

    public Rectangle(String name, float length, float breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        return this.length;
    }

    public float getBreadth() {
        return this.breadth;
    }

}

class Square extends Rectangle {

    public Square(String name, float length) {
        super(name, length, length);
    }


}

class Parallelogram extends Rectangle {
    private float diagonal;

    public Parallelogram(String name, float length, float breadth, float diagonal) {
        super(name, length, breadth);
        this.diagonal = diagonal;
    }

    public  float add() {
        return length+breadth;
    }

}

class Rhombus extends Square {
    private float diagonal;

    public Rhombus(String name, float length, float diagonal) {
        super(name, length);
        this.diagonal = diagonal;
    }
}


public class TestFigures {
    
}
