package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Car extends Transport{
    private int numberOfDoors;
    private float volumeOfCarBag;
    private double maximumLoad;
    private int speedOfCar;

    Car(int numberOfDoors, float volumeOfCarBag, double maximumLoad, int speedOfCar, int id, double maxSpeed, String colour){
        super(id, maxSpeed, colour);
        this.numberOfDoors = numberOfDoors;
        this.volumeOfCarBag = volumeOfCarBag;
        this.maximumLoad = maximumLoad;
        this.speedOfCar = speedOfCar;
    }


    @Override
    int accelerate(int speed) {
        return speedOfCar;
    }
}