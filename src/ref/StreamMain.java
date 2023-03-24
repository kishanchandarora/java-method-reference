package ref;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(14, 12143, 45433, 454523, 345);
        System.out.println(integers);

//        integers.stream().forEach(e -> {
//            System.out.println(e);
//        });

        integers.stream().forEach(System.out::println);
    }
}
