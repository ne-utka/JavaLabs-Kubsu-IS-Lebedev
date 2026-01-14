public class Desktop extends Computer {
    private String graphicsCard;

    public Desktop() {
    }

    public Desktop(String model, int processorPower, String graphicsCard) {
        super(model, processorPower);
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Desktop{model='" + getModel() + "', processorPower=" + getProcessorPower() +
                ", graphicsCard='" + graphicsCard + "'}";
    }
}
