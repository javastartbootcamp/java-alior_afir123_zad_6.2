package pl.javastart.task;

public class Computer {
    Memory memory;
    Processor processor;
    HardDrive hardDrive;

    public Computer(Processor processor, Memory memory, HardDrive hardDrive) {
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory=" + memory +
                ", processor=" + processor +
                ", hardDrive=" + hardDrive +
                '}';
    }
}

