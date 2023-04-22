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
public class Train extends Transport {
    private double maxLoadOnTrain;
    private String name;
    private int speedOfTrain;

    public String getHeaders() {
        return super.getHeaders() + ",\t" + "maxLoadOnTrain"
                + ",\t" + "name" + ",\t" + "speedOfTrain";
    }

    public String toCSV() {
        return super.toCSV() + ",\t" + maxLoadOnTrain
                + ",\t" + name + ",\t" + speedOfTrain;
    }

    public Train(final double MaxLoadOnTrain,
                 final String name,
                 final int speedOfTrain, final int id,
                 final double maxSpeed,
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