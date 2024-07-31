package LeetCodeHashTable;

import java.util.HashMap;

public class Count_Elements_With_Maximum_Frequency {


    public static void main(String[] args) {

        //nums =
        //[1,2,4,5,6,7,8,8,8]
        System.out.println(maxFrequencyElements(new int[]{1, 2, 4, 5, 6, 7, 8, 8, 8}));
    }

    public static int  maxFrequencyElements(int[] nums) {
    var map = new HashMap<Integer,Integer>();
        for(var num : nums){
        map.put(num, map.getOrDefault(num,0)+1);
    }
    final int max = map.values().stream().max(Integer::compare).orElse(0);
    var count =  (int)map.entrySet().stream()
            .filter(x -> x.getValue() == max)
            .count();
        return max * count;
}
}
