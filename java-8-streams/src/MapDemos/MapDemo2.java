package MapDemos;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");


        // before java 8 without using streams
       /* for(String name: vehicles){
            System.out.println(name.length());
        }*/

        // using streams
        // Method 1
        vehicles.stream().map(vname -> vname.length()).forEach(System.out::println);

        // Method 2
        vehicles.stream().map(vname -> vname.length()).forEach(len -> System.out.println(len));
    }

}
