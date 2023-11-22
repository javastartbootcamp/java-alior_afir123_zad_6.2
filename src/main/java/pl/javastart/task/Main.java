package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Computer c1 = new Computer(
                new Processor("i3", "Intel", "123456", 1000, 15),
                new Memory("ATM", "AMIGA", "44444", 1024, 1000, 15),
                new HardDrive("H3", "Sony", "123421124", 1000));

        System.out.println(c1);
        try {
            c1.memory.setTiming(1200);
            System.out.println(c1);
            c1.memory.setTiming(1400);
            System.out.println(c1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Koniec programu");
        }

        System.out.println(c1);
        try {
            c1.processor.setTiming(1200);
            System.out.println(c1);
            c1.processor.setTiming(1600);
            System.out.println(c1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Koniec programu");
        }
    }
}