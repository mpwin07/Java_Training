// 345. Reverse Vowels of a String

// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.


class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int j = arr.length - 1;
        for(int i=0;i<j;i++) {
            if (vowels.indexOf(arr[i]) != -1) 
            {
                while (i < j && vowels.indexOf(arr[j]) == -1) 
                {
                    j--;
                }
                if (i < j) 
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
        }
        return new String(arr);
    }
}