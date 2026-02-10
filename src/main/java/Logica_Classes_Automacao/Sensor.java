package Logica_Classes_Automacao;

import java.util.Random;

@SuppressWarnings("all")


public class Sensor {
    protected String sensor_name;
    protected Double sensor_value;
    protected Double min;
    protected Double max;

    public String getSensor_name() {
        return sensor_name;
    }

    public void setSensor_name(String sensor_name) {
        this.sensor_name = sensor_name;
    }

    public Double getSensor_value() {
        return sensor_value;
    }

    public void setSensor_value(Double sensor_value) {
        this.sensor_value = sensor_value;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public Sensor(String sensor_name, Double sensor_value, Double min, Double max) {}

    public static double read_sensor(String tag) {
        Random rand = new Random();
        double read_value = 10 + (100 - 10) * rand.nextDouble();
        return read_value;
    }

    public static void validate_data_Sec(String sensor_name, Double value_sensor, Double min, Double max) {
        System.out.printf("Sensor: %s | Actual Value: %.2f°C", sensor_name, value_sensor);

        if (value_sensor >= min && value_sensor <= max) {
            System.out.println("\n >> Normal Operation << ");
        } else {
            System.out.println("\n >> Outside of Security levels << ");
        }
    }
}
