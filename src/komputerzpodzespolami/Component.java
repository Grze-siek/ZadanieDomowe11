package komputerzpodzespolami;

public abstract class Component extends Computer{
    public String modelName;
    public String producerName;
    public String serialNumber;

    public Component(String modelName, String producerName, String serialNumber) {
        this.modelName = modelName;
        this.producerName = producerName;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return  "{" +
                "modelName ='" + modelName + '\'' +
                ", producerName ='" + producerName + '\'' +
                ", serialNumber ='" + serialNumber + '\'';
    }
}
