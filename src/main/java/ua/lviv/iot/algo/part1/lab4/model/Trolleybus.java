package ua.lviv.iot.algo.part1.lab4.model;

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

    public void stop() {
        if (currentSpeed < maxSpeedOfTrolleybus) {
            currentSpeed = 0;
        } else {
            System.out.println("Error");
        }
    }

    public void start() {
        currentSpeed = 20;
    }
    public void addPassenger(){

        for (int i = 0; i < 25; i++) {
                passengers++;
        }
        for (int i = 0; i >= 25; i++) {
            System.out.println("  The trolley bus is crowded \n");
            break;
        }
    }

    public void removePassenger() {

        if (passengers >= 25) {
            passengers--;
        }
    }


    public String getHeaders() {
        return super.getHeaders() + ",\t" + "id1" + ",\t" + "routeNumber" + ",\t"
                + "currentStop" + ",\t" + "maxSpeedOfTrolleybus"
                + ",\t" + "passengers" + ",\t" + "currentSpeed";
    }

    public String toCSV() {
        return super.toCSV() + ",\t" + id1 + ",\t"
                + routeNumber + ",\t" + currentSpeed + ",\t"
                + maxSpeedOfTrolleybus + ",\t" + passengers
                + ",\t" + currentSpeed;
    }

    public Trolleybus(final int id1, final int routeNumber, final int currentStop,
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
    public int accelerate(final int speed) {
        return currentSpeed;
    }
}