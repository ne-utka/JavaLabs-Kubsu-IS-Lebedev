public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Неверное количество параметров");
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double min = x < y ? x : y;
        double result = min / 2;

        System.out.println(result);
    }
}
