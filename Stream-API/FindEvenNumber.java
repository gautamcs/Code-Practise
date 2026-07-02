import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> evenNum = list.stream().filter(i -> i %2 == 0).toList();
        System.out.println(" Even Number: " +Arrays.toString(evenNum.toArray()));
    }
}
