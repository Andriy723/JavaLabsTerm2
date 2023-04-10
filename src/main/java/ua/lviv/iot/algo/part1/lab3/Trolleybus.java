package ua.lviv.iot.algo.part1.lab3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
        } else {
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
        return passengers;
    }

    public double removePassenger() {

        if (passengers >= 25) {
            passengers--;
        }
        return passengers;
    }

    Trolleybus(final int id1,final int routeNumber, final int currentStop,
               final double maxSpeedOfTrolleybus, final int passengers,
               final int currentSpeed, final int id,
               final double maxSpeed, final String colour) {
        super(id, maxSpeed, colour);
        this.id1 = id1;
        this.routeNumber = routeNumber;
        this.currentStop = currentStop;
        this.maxSpeedOfTrolleybus = maxSpeedOfTrolleybus;
        this.passengers = passengers;
        this.currentSpeed = currentSpeed;
    }


    @Override
    int accelerate(final int speed) {
        return currentSpeed;
    }
}