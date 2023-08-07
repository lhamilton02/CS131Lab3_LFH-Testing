package arraylist;

public class PointThreeD {
    private double x, y, z;

    public PointThreeD(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D - X: " + x + ", Y: " + y + ", Z: " + z;
    }
}
