package LeetCodeHashTable;

import java.util.HashMap;

public class Kth_Distinct_String_in_an_Array {

    public static void main(String[] args) {

        //Input: arr = ["a","b","c","a","c","c"], k = 3
        //Output: "b"
        System.out.println(kthDistinct(new String[]{"a", "b", "c", "a", "c", "c","e"}, 2));
    }

    public static String kthDistinct(String[] arr, int k) {
        var map = new HashMap<String, Integer>();
        var resultMap = new HashMap<Integer, String>();
        for(var i = 0 ; i< arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        var p = 0;
        for (var e : arr){
            if(map.get(e) == 1 ){
                p++;
                if(p == k ){
                    return e;
                }
            }
        }
        return "";
    }
}
