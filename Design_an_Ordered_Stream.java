package LeetCodeHashTable;

import java.util.ArrayList;
import java.util.List;

public class Design_an_Ordered_Stream {

    private String stream[];
    private int ptr= 0;

    public Design_an_Ordered_Stream(int n) {
        stream = new String[n];
    }

    public List<String> insert(int id, String value) {
        List<String> res = new ArrayList<>();
        stream[id - 1] = value;
        while (ptr < stream.length && stream[ptr] != null) {
            res.add(stream[ptr]);
            ptr++;
        }
        return res;
    }

    public static void main(String[] args) {
        Design_an_Ordered_Stream obj = new Design_an_Ordered_Stream(5);
        //[[5],[3,"ccccc"],[1,"aaaaa"],[2,"bbbbb"],[5,"eeeee"],[4,"ddddd"]]
        System.out.println(obj.insert(3, "ccccc"));
        System.out.println(obj.insert(1, "aaaaa"));
        System.out.println(obj.insert(2, "bbbbb"));
        System.out.println(obj.insert(5,"eeeee"));
        System.out.println(obj.insert(4,"ddddd"));
    }
}
