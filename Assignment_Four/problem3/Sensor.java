package Assignment_Four.problem3;
public interface Sensor {
    String getSensorType();
    double getReading();

    String getLocation();

    String getLastUpdated();

    String toString();


    public String performAction();

}
