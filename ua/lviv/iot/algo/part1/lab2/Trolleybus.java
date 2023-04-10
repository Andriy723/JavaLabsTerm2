package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Trolleybus extends Transport {
    private int id1 = 100;
    private int routeNumber;
    private int currentStop;
    private double maxSpeedOfTrolleybus;
    private int passengers;
    private int currentSpeed;
    private static Trolleybus defaultTrolleybus = new Trolleybus();

    public static Trolleybus getInstance() {
        return defaultTrolleybus;
    }
    public double stop() {
        if (currentSpeed < maxSpeedOfTrolleybus) {
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

    Trolleybus(int id1, int routeNumber, int currentStop, double maxSpeedOfTrolleybus,int passengers, int currentSpeed, int id, double maxSpeed, String colour){
        super(id, maxSpeed, colour);
        this.id1 = id1;
        this.routeNumber = routeNumber;
        this.currentStop = currentStop;
        this.maxSpeedOfTrolleybus = maxSpeedOfTrolleybus;
        this.passengers = passengers;
        this.currentSpeed = currentSpeed;
    }


    @Override
    int accelerate(int speed) {
        return currentSpeed;
    }
}