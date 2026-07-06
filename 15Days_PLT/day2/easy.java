//1662. Check If Two String Arrays are Equivalent

import java.util.*;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        String s1 = String.join("",word1);
        String s2 = String.join("",word2);
        if(s1.equals(s2)) return true;
        else return false;
        //Write Code Here
       
    }
}

public class easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
       
        int n1 = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] word1 = new String[n1];

       
        for (int i = 0; i < n1; i++) {
            word1[i] = sc.nextLine();
        }

        // Input for second array
      
        int n2 = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] word2 = new String[n2];

     
        for (int i = 0; i < n2; i++) {
            word2[i] = sc.nextLine();
        }

        Solution sol = new Solution();
        boolean result = sol.arrayStringsAreEqual(word1, word2);

        System.out.println("Are both string arrays equal? " + result);

        sc.close();
    }
}
