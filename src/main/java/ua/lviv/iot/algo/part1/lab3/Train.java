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
public class Train extends Transport {
    private double maxLoadOnTrain;
    private String name;
    private int speedOfTrain;

    Train(final double MaxLoadOnTrain, final String name,
          final int speedOfTrain, final int id, final double maxSpeed,
          final String colour) {
        super(id, maxSpeed, colour);
        this.maxLoadOnTrain = MaxLoadOnTrain;
        this.name = name;
        this.speedOfTrain = speedOfTrain;
    }

    @Override
    int accelerate(final int speed) {
        return speedOfTrain;
    }
}

