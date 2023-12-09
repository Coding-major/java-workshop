class Rectangle {
    private float length;
    private float height;

    public Rectangle(float len, float height) {
        this.length = len;
        this.height = height;
    }

    public float perimeterRect() {
        float perimeter = 2f*(this.length + this.height);
        return perimeter;
        
    }

    public float getLength() {
        return this.length;
    }

    public float getHeight() {
        return this.height;
    }


}

class Box {
    private float length;
    private float height;
    private float width;

    public Box(float len, float height, float width) {
        this.length = len;
        this.height = height;
        this.width = width;
    }

    public float perimeterBox() {
        float perimeter = 4f*(this.length + this.height + this.width);
        return perimeter;
    }

    public float getLength() {
        return this.length;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

}

public class TestObject {
    public static void main (String[] args) {
        Rectangle rect = new Rectangle(3f, 4.50f);
        Box box = new Box(3.4f,5.2f,7f);

        System.out.println(rect.getLength());
        System.out.println(rect.getHeight());
        System.out.println("perimeter of rectangle is " + rect.perimeterRect());

        System.out.println("//////////////////////////");
        System.out.println(box.getLength());
        System.out.println(box.getHeight());
        System.out.println(box.getWidth());
        System.out.println(box.perimeterBox());
    }
}
