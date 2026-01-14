public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2.5, -1.0);
        ComplexNumber b = new ComplexNumber(2.5, -1.0);
        ComplexNumber c = new ComplexNumber(1.0, 3.0);

        System.out.println(a + " == " + b + " -> " + a.equalsTo(b));
        System.out.println(a + " == " + c + " -> " + a.equalsTo(c));
    }
}
