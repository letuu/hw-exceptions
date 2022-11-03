package pro.sky.java.ds_3_0.task2;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final float engineVolume;

    protected Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void printType();

    public abstract boolean passDiagnostics();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
