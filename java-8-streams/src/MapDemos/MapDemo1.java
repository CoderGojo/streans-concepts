package MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> vehiclesListinUpperCase = new ArrayList<String>();

        // Before java8 without using streams
        /*for(String name:vehicles){
            vehiclesListinUpperCase.add(name.toUpperCase());
        }*/

        // stream -map
        vehiclesListinUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(vehiclesListinUpperCase);

    }
}
