package LeetCodeHashTable;

import java.util.HashMap;
import java.util.List;

public class Destination_City {

    public static void main(String[] args) {

        //paths =
        //[["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
        System.out.println(destCity(List.of(List.of("London", "New York"),
                List.of("New York", "Lima"), List.of("Lima", "Sao Paulo"))));
    }

    public static String destCity(List<List<String>> paths) {
        var map = new HashMap<String,String>();
        for(var p :paths){
            map.put(p.get(0),p.get(1));
        }
        var  dest = "";
        for(var p : paths){
            if(map.get(p.get(1)) == null){
                dest = p.get(1);
            }
        }
        return dest;
    }
}
