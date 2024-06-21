package lesson5.Problem5.nonOO.ToOO;

public class Microware extends ClosedMachine{
    private int powerLevel;

    public Microware(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }
    @Override
    public void performFunction() {
        System.out.println("Heating food at power level: " + powerLevel + ".");
    }
}
