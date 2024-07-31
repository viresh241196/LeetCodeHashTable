package LeetCodeHashTable;

public class Count_Pairs_That_Form_a_Complete_Day_I {


    public static void main(String[] args) {
        //hours =
        //[72,48,24,3]
        System.out.println(countCompleteDayPairs(new int[]{12,12,30,24,24}));
    }

    public static int countCompleteDayPairs(int[] hours) {
        var count = 0;
        for(int i = 0 ; i<hours.length-1 ; i++){
            for(int j = i+1;j <hours.length; j++){
                if((hours[i] + hours[j]) % 24 == 0 ){
                    count++;
                }
            }
        }
        return count;
    }
}
