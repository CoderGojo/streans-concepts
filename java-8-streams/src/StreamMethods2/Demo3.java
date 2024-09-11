package StreamMethods2;

//findAny()
//findFirst()

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

    public static void main(String[] args) {

        //findAny()
        List<String> stringList = Arrays.asList("one", "two", "three", "one");
        Optional<String> ele=stringList.stream().findAny();

        System.out.println(ele.get());

        //findFirst()
        List<String> stringList1 = Arrays.asList("one","two","three","one");
        Optional<String> ele1 = stringList1.stream().findFirst();

        System.out.println(ele.get());



    }

}
