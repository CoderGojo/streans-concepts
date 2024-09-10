package StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Non terminal / processing methods
//distinct()
//limit()

// Terminal
//count()

public class Demo1 {

    public static void main(String[] args) {

       List<String> vehiclesList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");

       // Distinct
       List<String> distinctVehicleList = vehiclesList.stream().distinct().collect(Collectors.toList());
       System.out.println(distinctVehicleList);
       vehiclesList.stream().distinct().forEach(System.out::println);

        // Count
        long count = vehiclesList.stream().distinct().count();
        System.out.println(count);

        // limit
        List<String> limitVehicleList = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitVehicleList);


    }

}
