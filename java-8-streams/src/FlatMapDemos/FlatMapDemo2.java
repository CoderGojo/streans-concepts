package FlatMapDemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args) {

        List<String> teamA = Arrays.asList("Scott","David","John");
        List<String> teamB = Arrays.asList("Mary","Luna","Tom");
        List<String> teamC = Arrays.asList("Ken","Jony","Kitty");

        List<List<String>> playersInWorldCup = Arrays.asList(teamA,teamB,teamC);

        // Before Java 8
        for(List<String> team : playersInWorldCup){
            for(String name : team){
                System.out.println(name);
            }
        }

        // Using Stream flatMap()
        List<String> names = playersInWorldCup.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(names);

    }
}
