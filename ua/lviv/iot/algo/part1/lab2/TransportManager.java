package ua.lviv.iot.algo.part1.lab2;

import lombok.*;
import java.util.LinkedList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class TransportManager {
    private List<Transport> transports = new LinkedList<>();
    public void addTransport(Transport transport){
    this.transports.add(transport);
    }

    public List<Transport> findTransportWithSpeedBiggerThan(int current){
       return transports.stream()
            .filter(transport -> transport.getMaxSpeed() > current).toList();
    }
    public List<Transport> findTransportWithColour(String colour){
    return transports.stream()
            .filter(transport -> transport.getColour() == colour).toList();
    }
        public  static  void  main(String [] args){

            TransportManager transportManager = new TransportManager();

            transportManager.addTransport(new Car(4, 56, 57, 40));
            transportManager.addTransport(new Car(5, 44, 33, 35,0, 54,"White"));

            transportManager.addTransport(new Trolleybus());
            transportManager.addTransport(new Trolleybus(100, 3, 2, 3, 3,2 ));
            transportManager.addTransport(Trolleybus.getInstance());
            transportManager.addTransport(Trolleybus.getInstance());

            transportManager.addTransport(new Train());
            transportManager.addTransport(new Train(3,  "White", 44));

            transportManager.addTransport(new Plane(4, 5, 33));
            transportManager.addTransport(new Plane(343, 3, 3, 0, 45, "Dark"));

            for(Transport transportManager1 : transportManager.transports) {
                System.out.println("   " + transportManager1.toString() + "\n");
            }

            var transport2 = transportManager.findTransportWithSpeedBiggerThan(41);
            for (Transport transport0 : transport2){
                System.out.println(transport0);
            }

            var transport3 = transportManager.findTransportWithColour("White");
            for (Transport transport10 : transport3){
                System.out.println(transport10);
            }
    }
}