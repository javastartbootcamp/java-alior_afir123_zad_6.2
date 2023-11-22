package pl.javastart.task;

abstract class Component {
    String modelName;
    String producer;
    String serialNumber;

    public Component(String modelName, String producer, String serialNumber) {
        this.modelName = modelName;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Component{" +
                "modelName='" + modelName + '\'' +
                ", producer='" + producer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}