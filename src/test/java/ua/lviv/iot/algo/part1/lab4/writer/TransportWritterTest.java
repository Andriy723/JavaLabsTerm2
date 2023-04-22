package ua.lviv.iot.algo.part1.lab4.writer;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab4.model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

class TransportWritterTest {
    List<Transport> transports1 = new LinkedList<>();
    public static String PATH_FILE = "src/main/resources/result.csv";
    public static String PATH_FILE1 = "src/main/resources/expected.csv";
    public File currentFile;
    public File expectedFile = new File(PATH_FILE);

    @AfterEach
    public void setUp() throws IOException{
        Files.deleteIfExists(Path.of(PATH_FILE1));
    }

    @Test
    public void testExisting() throws IOException {

        transports1.add(new Car(48, 90,
                12, 333,
                40, 44, "Purple"));
        transports1.add(new Trolleybus(17, 99,
                57, 55,
                434, 33, 11,
                13, "Black"));
        transports1.add(new Train(67,
                "Sun of the world", 75,
                444, 656, "Green"));
        transports1.add(new Plane(111,
                24, 84,
                89, 37, "Pink"));

        File currentFile = new File(PATH_FILE1);
        File expectedFile = new File(PATH_FILE);

        TransportsWritter.writing(transports1, "src/main/resources/expected.csv");

        byte[] fileByte0 = FileUtils.readFileToByteArray(expectedFile);
        byte[] fileByte1 = FileUtils.readFileToByteArray(currentFile);

        assertArrayEquals(fileByte0,fileByte1);
    }

    @Test
    public void testNonExisting() throws IOException {
        TransportsWritter.writing(null, "src/main/resources/current.csv");
        File testingTheFile = new File("src/main/resources/current.csv");
        assertFalse(testingTheFile.exists());
    }

    @Test
    public void writeFileToFile() throws IOException {
        File file = new File(PATH_FILE1);
        Files.createFile(Path.of(PATH_FILE1));
        FileWriter fileWriter = new FileWriter(PATH_FILE1);
        fileWriter.write("I don't know what to do here");
        fileWriter.close();
        testExisting();
    }

}