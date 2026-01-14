public class Computer {
    private String model;
    private int processorPower;

    public Computer() {
    }

    public Computer(String model, int processorPower) {
        this.model = model;
        this.processorPower = processorPower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProcessorPower() {
        return processorPower;
    }

    public void setProcessorPower(int processorPower) {
        this.processorPower = processorPower;
    }

    @Override
    public String toString() {
        return "Computer{model='" + model + "', processorPower=" + processorPower + "}";
    }
}
