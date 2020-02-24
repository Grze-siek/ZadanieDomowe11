package komputerzpodzespolami;

public class HardDrive extends Component {
    public int capacity;

    public HardDrive(String modelName, String producerName, String serialNumber, int capacity) {
        super(modelName, producerName, serialNumber);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        //super(modelName, producerName, serialNumber);
        return "HardDrive" + super.toString() +
                ", capacity=" + capacity +
                "GB}";
    }
}
