package lesson5.Problem5.nonOO;

public class Refrigerator  {
    private int temperature;
    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }
}
