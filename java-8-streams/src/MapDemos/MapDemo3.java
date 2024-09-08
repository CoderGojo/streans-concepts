package MapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,3,4,5);

        List<Integer> multipliedList = new ArrayList<>();

        // Before Java 8
        /*for(int num :numberList){
            // System.out.println(num*3);
            multipliedList.add(num*3);
        }

        System.out.println(multipliedList);*/

        // Using streams-map
        // Method 1
        multipliedList = numberList.stream().map(num ->num*3).collect(Collectors.toList());
        System.out.println(multipliedList);

        // Method 2
        numberList.stream().map(num->num*3).forEach(System.out::println);

    }
}
