package pl.javastart.task;

public class HardDrive extends Component {
    int capacity;

    public HardDrive(String modelName, String producer, String serialNumber, int capacity) {
        super(modelName, producer, serialNumber);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "capacity=" + capacity +
                ", modelName='" + modelName + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}