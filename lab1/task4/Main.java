public class Main {
    public static void main(String[] args) {
        String expectedLogin = "admin";
        String expectedPassword = "qwerty";

        if (args.length != 2) {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
            return;
        }

        String login = args[0];
        String password = args[1];

        if (expectedLogin.equals(login) && expectedPassword.equals(password)) {
            System.out.println("Вас узнали. Добро пожаловать");
        } else {
            System.out.println("Логин и пароль не распознаны. Доступ запрещен");
        }
    }
}
