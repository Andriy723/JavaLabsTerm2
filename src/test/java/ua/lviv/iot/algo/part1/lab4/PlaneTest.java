package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    public void ShouldReturnSpeedOfPlane() {
        var plane = new Plane(35, 65, 55, 65, 55, "White");
        assertTrue(plane.accelerate(0) == 55);
    }

    @Test
    public void testingConstructor() {
        var plane = new Plane();
        plane.setColour(null);
        assertNull(plane.getColour());
    }

    @Test
    public void testingConstructorOfPlane(){
        var plane = new Plane();
        plane.setMaxHeightOfFlight(995.22F);
        assertEquals(995.22F, plane.getMaxHeightOfFlight());
    }

    @Test
    public void testToString(){
        var plane = new Plane(12,34,45);
        var plane1 = new Plane(8,19,67);
        assertFalse(plane1.toString() == plane.toString());
    }
}