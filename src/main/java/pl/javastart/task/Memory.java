package pl.javastart.task;

public class Memory extends Component {
    int memoryAmount;
    int timing;
    int currentTemperature;
    static final int MAX_SAFE_TEMPERATURE = 60;
    static final int RISE_OF_TEMPERATURE = 10;

    //pamięci ram o 15 stopni na każde 100MHz więcej.

    public void setTiming(int timing) {
        while (timing - this.timing >= 100) {
            int i = this.timing + 100;
            currentTemperature = currentTemperature + RISE_OF_TEMPERATURE;
            checkTemperature(currentTemperature, i);
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
        this.currentTemperature = currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    void checkTemperature(double currentTemperature, int timing) {
        if (currentTemperature > MAX_SAFE_TEMPERATURE) {
            throw new IllegalArgumentException("Maksymalna temperatura procesora została przekroczona ");
        } else {
            this.timing = timing;
        }
    }
}