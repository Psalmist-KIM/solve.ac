package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; ++tc) {
            int n = Integer.parseInt(br.readLine());
            int[][] stickers = new int[2][n + 1];
            for (int i = 0; i < 2; ++i) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j < n + 1; ++j) {
                    stickers[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] dp = new int[2][n + 1];
            dp[0][0] = dp[1][0] = 0;
            dp[0][1] = stickers[0][1];
            dp[1][1] = stickers[1][1];

            for(int i = 2; i < n + 1; ++i) {
                dp[0][i] = Math.max(dp[1][i - 2] + stickers[0][i], dp[1][i - 1] + stickers[0][i]);
                dp[1][i] = Math.max(dp[0][i - 2] + stickers[1][i], dp[0][i-1] + stickers[1][i]);
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}
