package komputerzpodzespolami;

public class TestClass {
    public static void main(String[] args) {
    Computer[] components = new Computer[3];
        components[0] = new Processor("intel core i5", "intel", "id654321", 1500, 50, 80);
        components[1] = new RAMMemory("DDR3", "Goodram", "id123456", 8, 1600, 35, 60);
        components[2] = new HardDrive("P300", "Toshiba", "WD500AAKX", 500);

        for (Computer component : components) {
            System.out.println(component.toString());
        }
        try {
            ((Processor)components[0]).increaseTiming(400);
            ((RAMMemory)components[1]).increaseTiming(100);
        } catch (maxTimingTemperatureException e) {
            System.err.println(e.getMessage());
        }

        for (Computer component : components) {
            System.out.println(component.toString());
        }
    }
}
