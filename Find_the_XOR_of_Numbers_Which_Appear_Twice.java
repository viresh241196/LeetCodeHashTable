package LeetCodeHashTable;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_the_XOR_of_Numbers_Which_Appear_Twice {

    public static void main(String[] args) {
        var nums = new  int[]{1,2,1,3};
        System.out.println(duplicateNumbersXOR(nums));
    }

    public static int duplicateNumbersXOR(int[] nums) {
        var result = Arrays.stream(nums)
                .boxed()
                .toList();
        return result.stream().filter(x-> result.indexOf(x) != result.lastIndexOf(x))
                .distinct()
                .reduce(0, (x,y) ->x^y);
    }

}
