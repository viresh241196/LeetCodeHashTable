package LeetCodeHashTable;

import java.util.HashSet;

public class Find_Maximum_Number_of_String_Pairs {


    public static void main(String[] args) {

        //input words =
        //["cd","ac","dc","ca","zz"]
        System.out.println(maximumNumberOfStringPairs(new String[]{"cd", "ac", "dc", "ca", "zz"}));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        var count = 0;
        var set = new HashSet<String>();
        for(var word : words) {
            var rev = new StringBuilder(word).reverse().toString();
            if(set.contains(rev)){
                count++;
                set.remove(word);
            }else{
                set.add(word);
            }
        }
        return count;
    }

}
