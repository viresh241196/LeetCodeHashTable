package LeetCodeHashTable;

import java.util.Arrays;
import java.util.HashMap;

public class Sort_the_People {

    public static void main(String[] args) {

        String[] names = {"Alex", "Ben", "Charlie", "David"};
        int[] heights = {5, 3, 2, 6};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        var hashtable = new HashMap<Integer,String>();
        for(int i = 0 ; i< names.length; i++){
            hashtable.put(heights[i],names[i]);
        }
        var result = new String[names.length];
        Arrays.sort(heights);
        int l = 0;
        for( int j = heights.length-1; j >=0;j--){
            result[l]= hashtable.get(heights[j]);
            l++;
        }
        return result;
    }
}
