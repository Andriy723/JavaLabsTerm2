package ua.lviv.iot.algo.part1.lab1;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Trolleybus {
    private int id = 100;
    private int routeNumber;
    private int currentStop;
    private double maxSpeed;
    private int passengers;
    private int currentSpeed;
    private static Trolleybus defaultTrolleybus = new Trolleybus();

    public static Trolleybus getInstance() {
        return defaultTrolleybus;
    }
    public double stop() {
        if (currentSpeed < maxSpeed) {
            return currentSpeed = 0;
        }
        else {
            System.out.println("Error");
        }
        return currentSpeed;
    }

    public double start() {
        return currentSpeed = 20;
    }

    public double addPassenger() {

        for (int i = 0; i < 25; i++) {
            passengers++;
        }
        for (int i = 0; i >= 25; i++) {
            System.out.println("  The trolley bus is crowded \n");
            break;
        }
        return 0;
    }

    public double removePassenger() {

        if (passengers >= 25) {
            passengers--;
        }
        return passengers;
    }

    public static void main(String[] args) {

        Trolleybus[] objects = {
                new Trolleybus(),
                new Trolleybus(100,50, 40 ,50,4,0),
                Trolleybus.getInstance(),
                Trolleybus.getInstance()
        };

        for (Trolleybus trolleybus: objects){
            System.out.println(trolleybus.toString());
        }

    }
}