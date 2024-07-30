package LeetCodeHashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Rings_and_Rods {

    public static void main(String[] args) {
    var str = "B0B6G0R6R0R6G9";

        System.out.println(countPoints(str));
    }

    public static int countPoints(String rings) {
        var count = 0;
        var map = new HashMap<Integer,HashSet<String>>();
        for (int i = 0 ; i<rings.length()-1; i = i+2 ){
            int key = Character.getNumericValue(rings.charAt(i+1));
//            if(map.get(key) != null){
//                    map.get(key).add(String.valueOf(rings.charAt(i)));
//            }else{
//                var set = new HashSet<String>();
//                set.add(String.valueOf(rings.charAt(i)));
//                map.put(key,set);
//            }
            map.computeIfAbsent(key,k->new HashSet<>()).add(String.valueOf(rings.charAt(i)));
        }
        for(var entry : map.entrySet()){
            if(checkIfAllColorsPresent(entry.getValue())){
                count++;
            }
        }
        return count;
    }

    private static boolean checkIfAllColorsPresent(HashSet<String> value) {
        return value.size() >= 3;

    }
}
