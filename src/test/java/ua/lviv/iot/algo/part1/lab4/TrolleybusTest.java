package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrolleybusTest {

    @Test
    public void ShouldReturnSpeedOfCar() {
        var trolleybus = new Trolleybus(44, 44, 44, 44,44,44, 44,44,"Black");
        assertTrue(trolleybus.accelerate(0) == 44);
    }

    @Test
    public void testingConstructor() {
        var trolleybus = new Trolleybus();
        trolleybus.setColour(null);
        assertNull(trolleybus.getColour());
    }

    @Test
    public void testingConstructorOfTrolleybus(){
        var trolleybus = new Trolleybus();
        trolleybus.setMaxSpeedOfTrolleybus(34.44F);
        assertEquals(34.44F, trolleybus.getMaxSpeedOfTrolleybus());
    }

    @Test
    public void testToString(){
        var trolleybus = new Trolleybus(152,354,455,5,5,59);
        var trolleybus1 = new Trolleybus(55, 22,11,11,90,45);
        assertFalse(trolleybus1.toString() == trolleybus.toString());
    }

    @Test
    public void testStop(){
        var trolleybus = new Trolleybus();
        trolleybus.setCurrentSpeed(66);
        trolleybus.setMaxSpeedOfTrolleybus(67);
        trolleybus.stop();
        assertEquals(0, trolleybus.getCurrentSpeed());
    }

    @Test
    public void testStart(){
        var trolleybus = new Trolleybus();
        trolleybus.start();
        assertEquals(20, trolleybus.getCurrentSpeed());
    }

    @Test
    public void testAddPassenger(){
        var trolleybus = new Trolleybus();
        trolleybus.setPassengers(0);
        trolleybus.addPassenger();
        assertEquals(25, trolleybus.getPassengers());
    }

    @Test
    public void testRemovePassengers(){
        var trolleybus = new Trolleybus();
        trolleybus.setPassengers(26);
        trolleybus.removePassenger();
        assertEquals(25, trolleybus.getPassengers());
    }
}