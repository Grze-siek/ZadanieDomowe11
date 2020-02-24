package komputerzpodzespolami;

public class Processor extends Component {
    public int timing;
    public final int temperatureIncrease = 10;
    public int timingTemperature;
    public int maxTimingTemperature;

    public Processor(String modelName, String producerName, String serialNumber, int timing, int timingTemperature, int maxTimingTemperature) {
        super(modelName, producerName, serialNumber);
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
            throw new maxTimingTemperatureException("Uwaga!!! Zagrozenie przegrzania procesora! Czynnosc nie jest mozliwa.");
    }

    @Override
    public String toString() {
        //super(modelName, producerName, serialNumber);
        return "Processor{" +
                "timing =" + timing +
                "MHz, timingTemperature =" + timingTemperature +
                ", maxTimingTemperature =" + maxTimingTemperature +
                '}';
    }
}
