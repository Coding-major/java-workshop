class Sphere {
    private float radius;

    public Sphere(float rad) {
        radius = rad;
    }

    public float volume() {
        float volume = (4f/3f)*(float) Math.PI * (radius*radius*radius);
        return volume;
    }

    public float heightContactPoint(Sphere secondSphere) {
        float sumofradii = this.radius + secondSphere.radius;
        float height = sumofradii - Math.abs(this.radius - secondSphere.radius);
        return height;
    }


}

class normalPractise {
    public static void main (String[] args) {
        Sphere sphere1 = new Sphere(20f);
        Sphere sphere2 = new Sphere(20f);
        Sphere sphere3 = new Sphere(10f);
    }
}
