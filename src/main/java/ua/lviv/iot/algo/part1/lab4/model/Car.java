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

public class Car extends Transport {
    private int numberOfDoors;
    private float volumeOfCarBag;
    private double maximumLoad;
    private int speedOfCar;

    public String getHeaders() {
        return super.getHeaders() + ",\t" + "numberOfDoors" + ",\t"
                + "volumeOfCarBag" + ",\t" + "maximumLoad" + ",\t"
                + "speedOfCar";
    }

    public String toCSV() {
        return super.toCSV() + ",\t" + numberOfDoors
                + ",\t" + volumeOfCarBag + ",\t"
                + maximumLoad + ",\t" + speedOfCar;
    }


    public Car(final int numberOfDoors, final float volumeOfCarBag,
               final double maximumLoad, final int speedOfCar,
               final int id, final double maxSpeed,
               final String colour) {
        super(id, maxSpeed, colour);
        this.numberOfDoors = numberOfDoors;
        this.volumeOfCarBag = volumeOfCarBag;
        this.maximumLoad = maximumLoad;
        this.speedOfCar = speedOfCar;
    }

    @Override
    public int accelerate(final int speed) {
        return speedOfCar;
    }
}