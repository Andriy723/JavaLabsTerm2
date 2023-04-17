package ua.lviv.iot.algo.part1.lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TransportsWritter {

    private static final String Path0
            = "src/main/resources/result.csv";

    public static void Writing(List<Transport> transports2, String Path0)
            throws IOException {

        if (transports2 == null || transports2.isEmpty()) {
            return;
        }

        FileWriter writer = new FileWriter(Path0);

        transports2 = new LinkedList<>();

                    transports2.add(new Car(48, 90,
                            12, 333,
                            40, 44, "Purple"));
                    transports2.add(new Trolleybus(17, 99,
                            57, 55,
                            434, 33, 11,
                            13, "Black"));
                    transports2.add(new Train(67,
                            "Sun of the world", 75,
                            444, 656, "Green"));
                    transports2.add(new Plane(111,
                            24, 84,
                            89, 37, "Pink"));

        Map<Integer,List<Transport>> transportById = new HashMap<>();
        for(Transport transport : transports2) {
            if (!transportById.containsKey(transport.getId())) {
                writer.write(transport.getHeaders());
                transportById.put(transport.getId(), new LinkedList<>());
            }
            writer.append("\n");
            writer.write(transport.toCSV());
        }
        writer.close();
    }

}