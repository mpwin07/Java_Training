// 854. K-Similar Strings

// Strings s1 and s2 are k-similar (for some non-negative integer k) if we can swap the positions of two letters in s1 exactly k times so that the resulting string equals s2.

// Given two anagrams s1 and s2, return the smallest k for which s1 and s2 are k-similar.

class Solution {
    public int kSimilarity(String s1, String s2) {
        if(s1.equals(s2)) return 0;

        Queue<String> queue = new LinkedList<>();
        Set<String> visit = new HashSet<>();

        queue.offer(s1);
        visit.add(s1);

        int swap = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int count=0;count<size;count++){
                String curr = queue.poll();

                if(curr.equals(s2)) return swap;

                int i=0;
                while(curr.charAt(i)==s2.charAt(i)) i++;

                for(int j=i+1;j<curr.length();j++){
                    if(curr.charAt(j)==s2.charAt(i) && curr.charAt(j)!=s2.charAt(j)){
                        char[] arr = curr.toCharArray();
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        String next = new String(arr);

                        if(!visit.contains(next)){
                            visit.add(next);
                            queue.offer(next);
                        }
                    }
                }
            }
            swap++;
        }
        return 0;
    }
} 

