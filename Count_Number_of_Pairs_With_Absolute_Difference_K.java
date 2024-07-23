package LeetCodeHashTable;

import java.util.HashMap;

public class Count_Number_of_Pairs_With_Absolute_Difference_K {

    public static void main(String[] args) {
    //nums =
        //[1,2,2,1] k = 1
        System.out.println(countKDifference(new int[]{1,2,2,1},1));
    }

    public static int countKDifference(int[] nums, int k) {
        var count = 0;
        var map = new HashMap<Integer,Integer>();
        for(int n : nums){
            count += map.getOrDefault(n-k,0) + map.getOrDefault(n+k,0);
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return count;
    }
}
