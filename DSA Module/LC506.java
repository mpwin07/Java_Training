// 506. Relative Ranks

// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.

 
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i=0;i<n;i++){
            pq.offer(new int[]{score[i],i});
        }
        String res[]= new String[n];
        int rank=1;
        while(!pq.isEmpty()){
            int curr[]= pq.poll();
            int index=curr[1];
            if(rank==1){
                res[index]="Gold Medal";
            }
            else if(rank==2){
                res[index]="Silver Medal";
            }
            else if(rank==3){
                res[index]="Bronze Medal";
            }
            else{
                res[index]=String.valueOf(rank);
            }
            rank++;

        }
        return res;
    }
}