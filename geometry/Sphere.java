package geometry;

public class Sphere {
    private float radius;

    public Sphere (float rad) {
        radius = rad;
    }

    public float volume() {
        float volume = (4f/3f);
        return volume;
    }

    public float heightContactPoint(Sphere secondSphere) {
        return 4;
    }
}
