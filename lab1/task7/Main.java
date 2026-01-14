public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Неверное количество параметров");
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = x <= -3
                ? x * x * x + 1
                : x <= 0
                ? 1 + Math.pow(2, Math.tan(x))
                : 1 / Math.tan(x) * (1 / Math.tan(x));

        double f = x <= -3
                ? Math.exp(x + 1)
                : x <= 0
                ? Math.pow(x, 4)
                : Math.pow(Math.tan(x), 1.0 / 5.0);

        System.out.println("Y = " + y);
        System.out.println("F = " + f);
    }
}
