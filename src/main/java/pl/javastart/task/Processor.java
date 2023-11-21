package pl.javastart.task;

public class Processor extends Component {
    int timing;
    double cpuTemperature = 40;
    static final int MAX_SAFE_TEMPERATURE = 60;
    static final int INCRESE_TEMPERATURE = 10;
    static final int INCRESE_TIMING = 100;

    //Temperatura procesora wzrasta o 10 stopni ze wzrostem taktowania o każde 100MHz,

    public Processor(String modelName, String producer, String serialNumber, int timing, double cpuTemperature) {
        super(modelName, producer, serialNumber);
        this.timing = timing;
        this.cpuTemperature = cpuTemperature;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "timing=" + timing +
                ", cpuTemperature=" + cpuTemperature +
                ", modelName='" + modelName + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}


