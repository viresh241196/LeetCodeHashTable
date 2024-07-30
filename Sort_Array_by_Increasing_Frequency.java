package LeetCodeHashTable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Sort_Array_by_Increasing_Frequency {

    public static void main(String[] args) {
    //Input: nums = [1,1,2,2,2,3]
    //Output: [3,1,1,2,2,2]
    System.out.println(Arrays.toString(new Sort_Array_by_Increasing_Frequency().frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
    }

    public int[] frequencySort(int[] nums) {
        var map = new HashMap<Integer,Integer>();
        for (var num : nums){
            map.put(num,map.getOrDefault(num,0) +1);
        }

        var newArray = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(newArray,(a, b)->{
            var aFreq = map.get(a);
            var bFreq = map.get(b);
            if(aFreq != bFreq){
                return aFreq - bFreq;
            } else {
                return b-a;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray.get(i);
        }
        return nums;
    }
}
