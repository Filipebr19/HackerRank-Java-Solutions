package javaSubstringComparisons;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //My code
        for(int i = 0; i <= s.length()-k; i++) {
            String newString = s.substring(i, i+k);
            if(smallest == "" && largest == "") {
                smallest = newString;
                largest = newString; 
            };
            
            if(newString.compareTo(smallest) < 0) {
                smallest = newString;
            } 
            
            if(newString.compareTo(largest) > 0) {
                largest = newString;
            }
        }

        return smallest + "\n" + largest;
    }
}
