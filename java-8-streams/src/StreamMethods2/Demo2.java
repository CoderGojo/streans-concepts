package StreamMethods2;

//anyMatch()
//allMatch()
//noneMatch()

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<String>();

        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two grapes");

        // AnyMatch
        boolean result = fruits.stream().anyMatch(value -> {return value.startsWith("One");});
        System.out.println(result);


        //AllMatch
        result= fruits.stream().allMatch(value -> {return value.startsWith("One");});
        System.out.println(result);

        //noneMatch
        result = fruits.stream().noneMatch(value -> {return value.startsWith("One");});
        System.out.println(result);
    }


}
