public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double distanceToPlane(double a, double b, double c, double d) {
        double numerator = Math.abs(a * x + b * y + c * z + d);
        double denominator = Math.sqrt(a * a + b * b + c * c);
        return numerator / denominator;
    }

    @Override
    public String toString() {
        return "Point3D{x=" + x + ", y=" + y + ", z=" + z + "}";
    }
}
