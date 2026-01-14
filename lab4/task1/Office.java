public class Office {
    private Computer[] computers;

    public Office() {
        this.computers = new Computer[0];
    }

    public Office(Computer[] computers) {
        this.computers = computers != null ? computers : new Computer[0];
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers != null ? computers : new Computer[0];
    }

    public void addComputer(Computer computer) {
        if (computer == null) {
            return;
        }
        Computer[] next = new Computer[computers.length + 1];
        for (int i = 0; i < computers.length; i++) {
            next[i] = computers[i];
        }
        next[computers.length] = computer;
        computers = next;
    }

    public Computer popComputer() {
        if (computers.length == 0) {
            return null;
        }
        Computer last = computers[computers.length - 1];
        Computer[] next = new Computer[computers.length - 1];
        for (int i = 0; i < next.length; i++) {
            next[i] = computers[i];
        }
        computers = next;
        return last;
    }

    public int countDesktops() {
        int count = 0;
        for (Computer computer : computers) {
            if (computer instanceof Desktop) {
                count++;
            }
        }
        return count;
    }

    public int countLaptops() {
        int count = 0;
        for (Computer computer : computers) {
            if (computer instanceof Laptop) {
                count++;
            }
        }
        return count;
    }

    public int countTablets() {
        int count = 0;
        for (Computer computer : computers) {
            if (computer instanceof Tablet) {
                count++;
            }
        }
        return count;
    }

    public void serviceComputers() {
        for (Computer computer : computers) {
            if (computer instanceof Laptop) {
                ((Laptop) computer).chargeBattery(10);
            } else if (computer instanceof Tablet) {
                ((Tablet) computer).chargeBattery(10);
            } else if (computer instanceof Desktop) {
                ((Desktop) computer).setGraphicsCard("RTX 4060");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Office{computers=[");
        for (int i = 0; i < computers.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(computers[i]);
        }
        sb.append("]}");
        return sb.toString();
    }
}
