//Container With Most Water

import java.util.*;

public class medium {

    public int maxArea(int[] height)
    {
        int l = 0, r = height.length-1, max = 0;
        while(l<r){
            int min = Math.min(height[r], height[l]);
            int area = min*(r-l);
            max = Math.max(max,area);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return max;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        String input = sc.nextLine();
        String arrayPart = input.substring(1, input.length() - 1);
        String[] parts = arrayPart.split(",");

        int[] height = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            height[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.println(solution.maxArea(height));
        sc.close();
    }
}
