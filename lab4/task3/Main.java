public class Main {
    public static void main(String[] args) {
        Point p = new Point(2, -1);
        double lineDist = p.distanceToLine(1, -2, 3);

        Point3D p3 = new Point3D(1, 2, -2);
        double planeDist = p3.distanceToPlane(2, -1, 2, -3);

        System.out.println("Point to line: " + lineDist);
        System.out.println("Point3D to plane: " + planeDist);
    }
}
