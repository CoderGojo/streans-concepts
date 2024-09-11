package StreamMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);

        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);  /// Ascending order

        System.out.println("<!----------------------!>");

        List<Integer> sortedDescList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDescList); /// Descending order

        // String
        List<String> list2 = Arrays.asList("John","Mary","Kim","David","Smith");

        System.out.println("<!----------------------!>");

        List<String> sortedList2 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);

        System.out.println("<!----------------------!>");

        List<String> reversedSortedList = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversedSortedList);


    }

}
