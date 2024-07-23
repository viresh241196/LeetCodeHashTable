package LeetCodeHashTable;

import java.util.HashMap;

public class Number_of_Arithmetic_Triplets {
//1 4 7
//
//4- 1 = 3 || 4 = 3 +1
//
//7-4 = 3 || 7 = 1 + 2 *3


    public static void main(String[] args) {
    //nums =
        //[0,1,4,6,7,10] diff = 3
        //Output: 6
        System.out.println(arithmeticTriplets(new int[]{0,1,4,6,7,10},3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        var count = 0;
        var map = new HashMap<Integer,Integer>();
        for (int i= 0; i< nums.length; i++){
            map.put(nums[i],i);
        }
        for(int num :nums ){
            if(map.containsKey(num + diff) && map.containsKey(num + 2*diff)){
                count++;
            }
        }
        return count;
    }

}
