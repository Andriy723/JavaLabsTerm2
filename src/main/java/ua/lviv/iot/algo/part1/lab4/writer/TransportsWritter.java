package ua.lviv.iot.algo.part1.lab4.writer;

import ua.lviv.iot.algo.part1.lab4.model.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class TransportsWritter {
    private static final String PATH_FILE
            = "src/main/resources/result.csv";
    public static void writing(List<Transport> transports, String PATH_FILE)
            throws IOException {

        if (transports == null || transports.isEmpty()) {
            return;
        }

        try(FileWriter writer = new FileWriter(PATH_FILE)) {

            transports.add(new Car(48, 90,12, 333,40, 44, "Purple"));
            transports.add(new Trolleybus(17, 99,57, 55,434, 33, 11,13, "Black"));
            transports.add(new Train(67,"Sun of the world", 75,444, 656, "Green"));
            transports.add(new Plane(111,24, 84,89, 37, "Pink"));

            List<String> headers = new LinkedList<>();

            Collections.sort(transports, Comparator.comparing(n->n.getClass().getSimpleName()));
            for (Transport transport : transports) {
                if (!headers.contains(transports.getClass().getSimpleName())) {
                    writer.write(transport.getHeaders());
                    headers.add(transport.getClass().getSimpleName());
                }
                writer.write(transport.toCSV());
            }

        }catch (IOException e){
            e.getMessage();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        List<Transport> transports = new LinkedList<>();

        transports.add(new Car(48, 90,12, 333,40, 44, "Purple"));
        transports.add(new Trolleybus(17, 99,57, 55,434, 33, 11,13, "Black"));
        transports.add(new Train(67,"Sun of the world", 75,444, 656, "Green"));
        transports.add(new Plane(111,24, 84,89, 37, "Pink"));

        TransportsWritter.writing(transports, "src/main/resources/result.csv");
    }
}