// // polymorphism

// interface animal {
//     void name();
//     String address();
// }

// class cat implements animal {
//     void name() {
//         System.out.println("jbdzvijhvdhiudvshui");
//     }

//     String address() {
//         return "14 lagos street";
//     }

// }

// class


class firstSphere {
    private float radius;

    public firstSphere(float rad) {
        this.radius = rad;
    }

    public float volume() {
        float volume = (4f/3f) * (float)Math.PI * (radius * radius);
        return volume;
    }

    public float heightContactPoint(firstSphere secondSphere ) {
        return radius * secondSphere.radius;
    }
}

public class Sphere {
    public static void main(String[] args) {
        firstSphere f1 = new firstSphere(3.5f);
        firstSphere f2 = new firstSphere(5.7f);
        firstSphere f3 = new firstSphere(5.7f);


        f1.heightContactPoint(f2);
        f1.heightContactPoint(f3);
        f2.heightContactPoint(f3);

        f1.volume();

        // float height1 = f1.heightContactPoint(f2);
        // float height2 = f1.heightContactPoint(f3);
        // float height3 = f2.heightContactPoint(f3);
        
        // System.out.println(height1);
        // System.out.println(height2);
        // System.out.println(height3);
    }
}
