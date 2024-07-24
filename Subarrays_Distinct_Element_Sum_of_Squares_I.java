package LeetCodeHashTable;

import java.util.HashSet;
import java.util.List;

public class Subarrays_Distinct_Element_Sum_of_Squares_I {


    public static void main(String[] args) {

        //nums =
        //[1,2,1]
        System.out.println(sumCounts(List.of(1, 2, 1)));
    }

    public static int sumCounts(List<Integer> nums) {
        var result = 0;
        for (int i = 0; i < nums.size(); i++) {
            var set = new HashSet<Integer>();
            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                result += set.size() * set.size();
            }
        }
        return result;
    }
}
