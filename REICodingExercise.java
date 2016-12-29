package reicodingexercise;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Michael Chun
 */
public class REICodingExercise {
    
    public static String makePair(int start, int end){
        return "(" + start + "," + end + ")";
    }
    
    public static Set increasingRanges(int[] data){
        Set<String> pairs = new HashSet<String>();
        int start = 0;
        int end = 0;
                
        while(end < data.length){
            if(end != data.length-1 && data[end] < data[end+1]){
                end++;
            } else {
                if(start == end){
                    start++;
                    end++;
                } else{
                    pairs.add(makePair(start, end));
                    end++;
                    start = end;
                }
            }
        }
        
        return pairs;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* REI test case */
        int[] test1 = {1,2,3,4,5,6,3,6,8,5,8,9,4,3,5};
        System.out.println(increasingRanges(test1).toString());
        
        /* single repetition of numbers */
        int[] test2 = {1,2,3,4,4,5,6};
        System.out.println(increasingRanges(test2).toString());
        
        /* multipule repetition of numbers */
        int[] test3 = {1,2,3,4,4,4,5,6};
        System.out.println(increasingRanges(test3).toString());
        
        /* use of negative numbers */
        int[] test4 = {-1,-2,-3,-2,-1,0};
        System.out.println(increasingRanges(test4).toString());
    }
    
}
