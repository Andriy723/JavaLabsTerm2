package ua.lviv.iot.algo.part1.lab4;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class TransportManager {
    private final List<Transport> transports = new LinkedList<>();

    public void addTransport(final Transport transport) {
        this.transports.add(transport);
    }

    public List<Transport> findTransportWithSpeedBiggerThan(final int current) {
        return transports.stream()
                .filter(transport -> transport.getMaxSpeed()
                        > current).toList();
    }

    public List<Transport> findTransportWithColour(final String colour) {
        return transports.stream()
                .filter(transport -> transport.getColour()
                        == colour).toList();
    }
}