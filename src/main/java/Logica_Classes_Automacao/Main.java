package Logica_Classes_Automacao;

@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("== Industrial Monitoring System -- V0.1 ==");
        System.out.println("==========================================");

        Sensor sensor1 = new Sensor("Sensor1", Sensor.read_sensor("a"), 20.0, 90.0);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nReading process data.. - Cicle N° " + i + ".");

            double value_temp = sensor1.read_sensor("Temperature_OVEN_01");
            
            sensor1.validate_data_Sec("Temperature", value_temp, 20.0, 80.0);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("| ERR0R: ERROR IN TIME! |");
            }
        }

        System.out.println("\n");
        System.out.println("===================");
        System.out.println("== COLLECT ENDED ==");
        System.out.println("===================");
    }
}
