public class Laptop extends Computer {
    private int batteryLevel;

    public Laptop() {
    }

    public Laptop(String model, int processorPower, int batteryLevel) {
        super(model, processorPower);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
        }
    }

    @Override
    public String toString() {
        return "Laptop{model='" + getModel() + "', processorPower=" + getProcessorPower() +
                ", batteryLevel=" + batteryLevel + "}";
    }
}
