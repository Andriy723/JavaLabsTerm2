package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class TransportWritterTest {
    List<Transport> transports1 = new LinkedList<>();
    public static String Path0 = "src/main/resources/result.csv";
    public static String Path1 = "src/main/resources/expected.csv";
    TransportsWritter writer;
    public File file0;

    @Test
    public void testExisting() throws IOException {
        transports1.add(new Car());
        transports1.add(new Train(3,"3",3,3,3,"t"));
        File file0 = new File(Path0);
        TransportsWritter.Writing(transports1, Path0);

        assertTrue(Files.exists(file0.toPath()));
    }

    @Test
    public void testNonExisting() throws IOException {
        transports1 = new LinkedList<>();

        writer.Writing(transports1, Path0);

        assertEquals(null,file0);
    }

    @Test
    public void writeFileToFile() throws IOException {
        File file0 = new File(Path0);
        Files.createFile(Path.of(Path0));
        testExisting();
    }
    @AfterEach
    public void setUp() throws IOException{
        Files.deleteIfExists(Path.of(Path0));
    }
}