public class Main {
    public static void main(String[] args) {
        Desktop d1 = new Desktop("OfficePC", 120, "GTX 1660");
        Laptop l1 = new Laptop("WorkBook", 90, 50);
        Tablet t1 = new Tablet("TabA", 60, 30);

        Office office = new Office(new Computer[]{d1, l1});
        office.addComputer(t1);
        office.serviceComputers();

        System.out.println(office);
        System.out.println("Desktops: " + office.countDesktops());
        System.out.println("Laptops: " + office.countLaptops());
        System.out.println("Tablets: " + office.countTablets());
    }
}
