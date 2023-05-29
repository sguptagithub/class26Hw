package class26Hw;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection {
    /*
    Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(5);
        integers.add(10);
        integers.add(5);
        integers.add(20);
        integers.add(10);

        int sum = 0;

        for (int num : integers){
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}
