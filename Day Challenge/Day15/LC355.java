import java.util.*;

class Twitter {

    private List<int[]> tweets;                 // [userId, tweetId]
    private Map<Integer, Set<Integer>> follow;  // follower → followees

    public Twitter() {
        tweets = new ArrayList<>();
        follow = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        tweets.add(new int[]{userId, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> fset = follow.getOrDefault(userId, new HashSet<>());
        fset.add(userId);

        for (int i = tweets.size() - 1; i >= 0 && res.size() < 10; i--) {
            int[] t = tweets.get(i);
            if (fset.contains(t[0])) {
                res.add(t[1]);
            }
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        follow.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (follow.containsKey(followerId))
            follow.get(followerId).remove(followeeId);
    }
}

public class LC355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Twitter tw = new Twitter();

        int q = sc.nextInt();   // number of operations
        while (q-- > 0) {
            String op = sc.next();

            if (op.equals("post")) {
                int u = sc.nextInt();
                int t = sc.nextInt();
                tw.postTweet(u, t);
            }
            else if (op.equals("follow")) {
                int f1 = sc.nextInt();
                int f2 = sc.nextInt();
                tw.follow(f1, f2);
            }
            else if (op.equals("unfollow")) {
                int f1 = sc.nextInt();
                int f2 = sc.nextInt();
                tw.unfollow(f1, f2);
            }
            else if (op.equals("get")) {
                int u = sc.nextInt();
                List<Integer> feed = tw.getNewsFeed(u);
                for (int x : feed) System.out.print(x + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}
