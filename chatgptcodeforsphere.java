public class Sphere {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    public float calculateVolume() {
        // Calculate the volume of the sphere using the formula (4/3) * π * r^3
        float volume = (4.0f / 3.0f) * (float)Math.PI * (radius * radius * radius);
        return volume;
    }

    public float heightContactPoint(Sphere secondSphere) {
        // Calculate the height of their contacting point when two spheres are in contact
        float height = 2 * radius + secondSphere.radius; // Sum of the two radii
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two spheres
        Sphere sphere1 = new Sphere(5.0f); // Sphere with a radius of 5 cm
        Sphere sphere2 = new Sphere(3.0f); // Sphere with a radius of 3 cm

        // Calculate the volumes of the spheres
        float volume1 = sphere1.calculateVolume();
        float volume2 = sphere2.calculateVolume();

        // Calculate the height of their contacting point
        float contactHeight = sphere1.heightContactPoint(sphere2);

        // Display the results
        System.out.println("Volume of Sphere 1: " + volume1 + " cubic cm");
        System.out.println("Volume of Sphere 2: " + volume2 + " cubic cm");
        System.out.println("Height of Contacting Point: " + contactHeight + " cm");
    }
}





