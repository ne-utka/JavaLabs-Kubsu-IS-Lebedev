public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && !args[0].isEmpty()) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello world");
        }
    }
}
