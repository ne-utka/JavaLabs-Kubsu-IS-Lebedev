public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Неверное количество параметров");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double min = a < b ? a : b;
        double max = a > b ? a : b;

        double d = (min - 2 * Math.sqrt(max)) / (1 + (max / min));
        System.out.println(d);
    }
}
