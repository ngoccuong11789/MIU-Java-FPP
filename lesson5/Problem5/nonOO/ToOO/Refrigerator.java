package lesson5.Problem5.nonOO.ToOO;

public class Refrigerator extends ClosedMachine {
    private int temperature;
    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    @Override
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }
}

