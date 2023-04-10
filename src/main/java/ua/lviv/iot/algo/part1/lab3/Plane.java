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
public class Plane extends Transport {
    private int numberOfPassengers;
    private double maxHeightOfFlight;
    private int speedOfPlane;

    Plane(final int numberOfPassengers, final double maxHeightOfFlight,
          final int speedOfPlane, final int id, final double maxSpeed,
          final String colour) {
        super(id, maxSpeed, colour);
        this.numberOfPassengers = numberOfPassengers;
        this.maxHeightOfFlight = maxHeightOfFlight;
        this.speedOfPlane = speedOfPlane;
    }

    @Override
    int accelerate(final int speed) {
        return speedOfPlane;
    }
}
