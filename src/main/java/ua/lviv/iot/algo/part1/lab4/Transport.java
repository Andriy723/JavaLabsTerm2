package ua.lviv.iot.algo.part1.lab4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public abstract class Transport {
    private int id = 0;
    private double maxSpeed;
    private String colour;

    public String getHeaders() {
        return "id" + ",\t" + "maxSpeed"
                + ",\t" + "colour";
    }

    public String toCSV() {
        return id + ",\t"
                + maxSpeed + ",\t" + colour;
    }

    abstract int accelerate(final int speed);
}