package DSA;

public class AirConditioner {

    private boolean status;
    private int temperature;

    public void turnOn() {
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }
    public boolean isOn(){
        return this.status;
    }

    public void increaseTemperature() {
        temperature++;
    }
}
