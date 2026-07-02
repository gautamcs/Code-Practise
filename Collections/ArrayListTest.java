package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 20; i++) {
            list.add(i);
        }

        List<Integer> evenInt = list.stream().filter(i -> i % 2 == 0).toList();
// forEach(a -> System.out.print(a));
        System.out.println(" Even Number: "+evenInt.toString());
    }
}
