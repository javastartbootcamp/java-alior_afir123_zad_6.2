package pl.javastart.task;

public class Memory extends Component implements Overclockable {
    int memoryAmount;
    int timing;
    int currentTemperature;
    static final int INCRESE_TEMPERATURE = 15;
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
    public String toString() {
        return "Memory{" +
                "memoryAmount=" + memoryAmount +
                ", timing=" + timing +
                ", currentTemperature=" + currentTemperature +
                ", modelName='" + modelName + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public Memory(String modelName, String producer, String serialNumber, int memoryAmount, int timing, int currentTemperature) {
        super(modelName, producer, serialNumber);
        this.memoryAmount = memoryAmount;
        this.timing = timing;
        overclock(currentTemperature, timing);
        this.currentTemperature = currentTemperature;
    }

    @Override
    public void overclock(double currentTemperature, int timing) {
        if (currentTemperature >= MAX_SAFE_TEMPERATURE) {
            throw new IllegalArgumentException("Maksymalna temperatura została przekroczona ");
        } else {
            this.timing = timing;
        }
    }
}