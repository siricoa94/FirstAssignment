 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String firstString = array[0];
        return firstString;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String secondString = array[1];
        return secondString;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String lastOne = array[array.length - 1];
        return lastOne;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String last = array[array.length - 2];
        return last;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String s: array){
        if(s.equals(value))return true;
    }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        return reverseArray(array);
    }
    public static String[] reverseArray(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        String[] reversedArray = list.toArray(arr);
   }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {      
        return Arrays.equals(array, reverseArray(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
       if (checkPangram(array) == true) 
            return true;
        else
            return false;
    }
    public static boolean checkPangram (String str) 
    { 
 
        boolean[] mark = new boolean[26]; 
 
        int index = 0; 

        for (int i = 0; i < str.length(); i++) 
        { 
            
            if ('A' <= str.charAt(i) &&  
                    str.charAt(i) <= 'Z') 
                          
                index = str.charAt(i) - 'A'; 
            else if('a' <= str.charAt(i) &&  
                        str.charAt(i) <= 'z') 
                              
                index = str.charAt(i) - 'a'; 
            mark[index] = true; 
        } 
        for (int i = 0; i <= 25; i++) 
            if (mark[i] == false) 
                return (false); 
        return (true); 
    } 

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        Arrays.stream(array)
      .collect(Collectors.groupingBy(s -> s))
      .forEach((k, v) -> System.out.println(k+" "+v.size()));
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        for(int i = 0; i < array.length; i ++) {
        for(int j = i + 1; j < array.length; j++){
        if(array[i] == array[j]){return (array);}}}
        
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        for(int i = 0; i < array.length; i ++) {
            
        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
