// 44. Wildcard Matching

// Given string s and pattern p:

// ? → matches any single character
// * → matches any sequence (including empty)

// Return true if pattern matches the entire string.

class Solution {
    public boolean isMatch(String s, String p) {
        int i=0,j=0,star=-1,sl=s.length(),pl=p.length(),match=0;
        while(i<sl){
            if(j<pl && (p.charAt(j)=='?'||p.charAt(j)==s.charAt(i))){
                i++;
                j++;
            }
            else if(j<pl && p.charAt(j)=='*'){
                star=j;
                j++;
                match=i;
            }
            else if(star!=-1){
                j=star+1;
                match++;
                i=match;
            }
            else{
                return false;
            }
        }
        while(j<pl && p.charAt(j)=='*'){
            j++;
        }
        return j==pl;
    }
}