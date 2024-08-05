package LeetCodeHashTable;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sum_of_Unique_Elements {

    public static void main(String[] args) {
    //Input: nums = [1,2,3,2]
    //Output: 4
        System.out.println(sumOfUnique(new int[]{1, 2, 3, 2}));
    }

    public static int sumOfUnique(int[] nums) {
        var map  = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        return  map.entrySet().stream()
                .filter(x-> x.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .sum();
    }
}
