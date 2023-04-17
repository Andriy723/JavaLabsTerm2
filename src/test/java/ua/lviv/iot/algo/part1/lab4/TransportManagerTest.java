package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportManagerTest {

    @Test
    public void testFindTransportWithSpeedBiggerThan() {
        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(new Plane());
        transportManager.addTransport(new Train());
        transportManager.addTransport(new Trolleybus(20, 55, 66, 99, 88, 77, 78, 78, ""));
        transportManager.addTransport(new Car(44,44,44,44,44,44,"44"));

        assertEquals(2, transportManager.findTransportWithSpeedBiggerThan(2).size());
    }

    @Test
    public void testFindTransportWithColour() {
        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(new Plane());
        transportManager.addTransport(new Train());
        transportManager.addTransport(new Trolleybus(20, 55, 66, 99, 88, 77, 5,5,"Red"));
        transportManager.addTransport(new Car(44,44,44,44,44,44,"Red"));

        assertEquals(2, transportManager.findTransportWithColour("Red").size());
    }

    @Test
    public void testToString() {
        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(new Plane(4,4,4,4,4,"4"));
        transportManager.addTransport(new Train(4,"4",4));

        TransportManager transportManager1 = new TransportManager();
        transportManager.addTransport(new Trolleybus(20, 55, 66, 99, 88, 77, 5,5,"Red"));
        transportManager.addTransport(new Car(44,44,44,44,44,44,"Red"));

        assertFalse(transportManager.toString() == transportManager1.toString());
    }

    @Test
    public void testAddTransport() {
        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(new Car());
        transportManager.addTransport(new Train());
        transportManager.addTransport(new Trolleybus(1,2,2,2,2,9));

        assertEquals(3, transportManager.getTransports().size());
    }

    @Test
    public void testConstructor(){
        TransportManager transportManager = new TransportManager();
        transportManager.addTransport(new Car());
        transportManager.addTransport(new Plane());

        TransportManager transportManager1 = new TransportManager();
        transportManager1.addTransport(new Car());
        transportManager1.addTransport(new Plane());
        transportManager1.addTransport(new Car());

        assertFalse(transportManager.toString() == transportManager1.getTransports().toString());
    }
}