package komputerzpodzespolami;

public class RAMMemory extends Component {
    public int memoryQuantity;
    public int timing;
    public final int temperatureIncrease = 15;
    public int timingTemperature;
    public int maxTimingTemperature;

    public RAMMemory(String modelName, String producerName, String serialNumber, int memoryQuantity, int timing, int timingTemperature, int maxTimingTemperature) {
        super(modelName, producerName, serialNumber);
        this.memoryQuantity = memoryQuantity;
        this.timing = timing;
        this.timingTemperature = timingTemperature;
        this.maxTimingTemperature = maxTimingTemperature;
    }

    public void increaseTiming(int timingQuantity) throws maxTimingTemperatureException {
        int timingQuantityTemperature = (timingQuantity * temperatureIncrease)/100;
        if(timingTemperature + timingQuantityTemperature < maxTimingTemperature) {
            timing += timingQuantity;
            timingTemperature += timingQuantityTemperature;
        }
        else
            throw new maxTimingTemperatureException("Uwaga!!! Zagrozenie przegrzania pamieci RAM! Czynnosc nie jest mozliwa.");
    }

    @Override
    public String toString() {
       // super(modelName, producerName, serialNumber);
        return "RAMMemory{" +
                "memoryQuantity=" + memoryQuantity +
                "MB, timing=" + timing +
                "MHz, timingTemperature=" + timingTemperature +
                ", maxTimingTemperature=" + maxTimingTemperature +
                '}';
    }
}
