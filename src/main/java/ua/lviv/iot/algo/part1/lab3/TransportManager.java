package ua.lviv.iot.algo.part1.lab3;

import lombok.*;

import java.util.LinkedList;
import java.util.List;
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class TransportManager {
    private List<Transport> transports = new LinkedList<>();

    public void addTransport(Transport transport) {
        this.transports.add(transport);
    }

    public List<Transport> findTransportWithSpeedBiggerThan(int current) {
        return transports.stream()
                .filter(transport -> transport.getMaxSpeed() > current).toList();
    }

    public List<Transport> findTransportWithColour(String colour) {
        return transports.stream()
                .filter(transport -> transport.getColour() == colour).toList();
    }
}