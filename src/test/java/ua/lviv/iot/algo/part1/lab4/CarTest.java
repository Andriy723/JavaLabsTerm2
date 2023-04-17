package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void ShouldReturnSpeedOfCar() {
        var car = new Car(56, 63, 46, 76, 63, 62, "Green");
        assertTrue(car.accelerate(0) == 76);
    }

    @Test
    public void testingConstructor() {
        var car = new Car();
        car.setColour(null);
        assertNull(car.getColour());
    }

    @Test
    public void testingConstructorOfCar(){
        var car = new Car();
        car.setVolumeOfCarBag(56.89F);
        assertEquals(56.89F, car.getVolumeOfCarBag());
    }


    @Test
    public void testToString(){
        var car = new Car(12,34,45,7);
        var car1 = new Car(8,19,67,20);
        assertNotSame(car.toString(), car1.toString());
    }
}