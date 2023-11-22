package pl.javastart.task;

public class Processor extends Component implements Overclockable {
    int timing;
    double currentTemperature;
    static final int INCRESE_TEMPERATURE = 10;
    static final int INCRESE_TIMING = 100;
    static final int MAX_SAFE_TEMPERATURE = 60;

    public void setTiming(int timing) {
        while (timing - this.timing >= INCRESE_TIMING) {
            int i = this.timing + INCRESE_TIMING;
            currentTemperature = currentTemperature + INCRESE_TEMPERATURE;
            overclock(currentTemperature, i);
        }
        this.timing = timing;
    }

    @Override
    public void overclock(double currentTemperature, int timing) {
        if (currentTemperature >= MAX_SAFE_TEMPERATURE) {
            throw new IllegalArgumentException("Maksymalna temperatura została przekroczona ");
        } else {
            this.timing = timing;
        }
    }

    public Processor(String modelName, String producer, String serialNumber, int timing, double currentTemperature) {
        super(modelName, producer, serialNumber);
        this.timing = timing;
        overclock(currentTemperature, timing);
        this.currentTemperature = currentTemperature;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "timing=" + timing +
                ", currentTemperature=" + currentTemperature +
                ", modelName='" + modelName + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}