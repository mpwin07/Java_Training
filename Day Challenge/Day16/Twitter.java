import java.util.Scanner;

class Tweet {

    static int[][] tweets = new int[30000][2];
    static int tweetCount = 0;

    static boolean[][] follow = new boolean[501][501];

    void postTweet(int userId, int tweetId) {
        tweets[tweetCount][0] = userId;
        tweets[tweetCount][1] = tweetId;
        tweetCount++;
    }

    int[] getNewsFeed(int userId) {
        int[] temp = new int[10];
        int k = 0;

        for (int i = tweetCount - 1; i >= 0 && k < 10; i--) {
            int u = tweets[i][0];
            int t = tweets[i][1];

            if (u == userId || follow[userId][u]) {
                temp[k++] = t;
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = temp[i];
        }
        return res;
    }

    void follow(int followerId, int followeeId) {
        if (followerId != followeeId)
            follow[followerId][followeeId] = true;
    }

    void unfollow(int followerId, int followeeId) {
        follow[followerId][followeeId] = false;
    }
}

public class Twitter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Tweet twitter = new Tweet();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();

            if (cmd.equals("post")) {
                int userId = sc.nextInt();
                int tweetId = sc.nextInt();
                twitter.postTweet(userId, tweetId);
            }

            else if (cmd.equals("get")) {
                int userId = sc.nextInt();
                int[] feed = twitter.getNewsFeed(userId);

                for (int x : feed)
                    System.out.print(x + " ");
                System.out.println();
            }

            else if (cmd.equals("follow")) {
                int f1 = sc.nextInt();
                int f2 = sc.nextInt();
                twitter.follow(f1, f2);
            }

            else if (cmd.equals("unfollow")) {
                int f1 = sc.nextInt();
                int f2 = sc.nextInt();
                twitter.unfollow(f1, f2);
            }
        }
    }
}