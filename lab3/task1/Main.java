public class Main {
    public static void main(String[] args) {
        Literature l1 = new Literature("L-001", "Книга", "Мастер и Маргарита", 1967, "Азбука", 480, "М. Булгаков");
        Literature l2 = new Literature("L-002", "Статья", "О языке", 1999, "Наука", 12, "И. Иванов");
        Literature l3 = new Literature("L-003", "Книга", "Преступление и наказание", 1866, "Эксмо", 672, "Ф. Достоевский");

        GroupLiterature group = new GroupLiterature("G-10", new Literature[]{l1, l2});
        group.addItem(l3);
        group.sortByYear();
        group.removeBySourceCode("L-002");

        System.out.println(group);
    }
}
