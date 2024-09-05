package FilterDemos;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterDemo3 {
    public static void main(String[] args) {

      List<String> words = Arrays.asList("cup",null,"forest","sky","book",null,"theatre");
      //words.stream().forEach(System.out::println);
      words.stream().filter(Objects::nonNull).forEach(System.out::println);

    }

}
