package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Train extends Transport {
    private double MaxLoadOnTrain;
    private String name;
    private int speedOfTrain;
    Train(double MaxLoadOnTrain, String name, int speedOfTrain, int id, double maxSpeed, String colour){
        super(id, maxSpeed, colour);
        this.MaxLoadOnTrain = MaxLoadOnTrain;
        this.name = name;
        this.speedOfTrain = speedOfTrain;
    }

    @Override
    int accelerate(int speed) {
        return speedOfTrain;
    }
}

