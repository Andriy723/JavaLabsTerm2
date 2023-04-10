package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Plane extends Transport{
private int numberOfPassengers;
private double maxHeightOfFlight;
private int speedOfPlane;

Plane(int numberOfPassengers, double maxHeightOfFlight, int speedOfPlane, int id, double maxSpeed, String colour){
    super(id, maxSpeed, colour);
    this.numberOfPassengers = numberOfPassengers;
    this.maxHeightOfFlight = maxHeightOfFlight;
    this.speedOfPlane = speedOfPlane;
}

    @Override
    int accelerate(int speed) {
        return speedOfPlane;
    }
}
