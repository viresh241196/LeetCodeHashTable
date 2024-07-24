package LeetCodeHashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Unique_Morse_Code_Words {


    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        System.out.println(uniqueMorseRepresentationsSmart(new String[]{"gin", "zen", "gig", "msg"}));
    }

    private static int uniqueMorseRepresentationsSmart(String[] words) {
        var morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        return (int)Arrays.stream(words).map(w->{
            var sb = new StringBuilder();
            for(var c : w.toCharArray()){
                sb.append(morse[c-'a']);
            }
            return sb.toString();
        }).distinct().count();
    }

    public static int uniqueMorseRepresentations(String[] words)  {
        var list = List.of(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        var map = new HashMap<Character,String>();
        var a = 'a';
        for(var str:  list){
            map.put(a,str);
            a++;
        }
        var set = new HashSet<String>();
        for (var word : words){
            var c = word.toCharArray();
            var br = new StringBuilder();
            for (var l : c){
                br.append(map.get(l));
            }
            set.add(br.toString());
        }
        return set.size();
    }


}
