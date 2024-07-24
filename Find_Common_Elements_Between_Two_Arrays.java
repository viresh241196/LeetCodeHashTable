package LeetCodeHashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Find_Common_Elements_Between_Two_Arrays {
    public static void main(String[] args) {
        //nums1 = [1,2,2,1], nums2 = [2,2]
        System.out.println(Arrays.toString(findIntersectionValues(new int[]{2,3,2}, new int[]{1, 2})));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        var map = new HashMap<Integer, Integer>();
        var list1 = Arrays.stream(nums1).boxed().toList();
        var list2 = Arrays.stream(nums2).boxed().toList();
        for(var n : list1){
            if(list2.contains(n)){
                map.put(1,map.getOrDefault(1,0)+1);
            }
        }
        for(var n : list2){
            if(list1.contains(n)){
                map.put(2,map.getOrDefault(2,0)+1);
            }
        }
        return new int[]{map.getOrDefault(1,0),map.getOrDefault(2,0)};
    }
}
