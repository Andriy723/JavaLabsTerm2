package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    @Test
    public void ShouldReturnSpeedOfTrain() {
        var train = new Train(5226, "Black Circle", 122, 1000, 623, "Red");
        assertTrue(train.accelerate(0) == 122);
        assertFalse(train.accelerate(0) == 19);
    }

    @Test
    public void testingConstructor() {
        var train = new Train();
        train.setColour(null);
        assertNull(train.getColour());
    }

    @Test
    public void testingConstructorOfTrain(){
        var train = new Train();
        train.setSpeedOfTrain(444);
        assertEquals(444, train.getSpeedOfTrain());
    }

    @Test
    public void testToString(){
        var train = new Train(92,"Red Bullet",415);
        var train1 = new Train(68,"Teddy Of Speed",167);
        assertFalse(train1.toString() == train.toString());
    }
}