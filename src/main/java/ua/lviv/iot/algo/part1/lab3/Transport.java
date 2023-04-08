package ua.lviv.iot.algo.part1.lab3;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Transport {
    private int id = 0;
    private double maxSpeed;
    private String colour;

    abstract int accelerate(int speed);
}