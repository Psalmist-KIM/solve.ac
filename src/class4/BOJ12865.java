package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* BOJ12865 평범한 배낭 [https://www.acmicpc.net/problem/12865]
 */
public class BOJ12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] weight = new int[n + 1];
        int[] value = new int[n + 1];

        for(int i = 1; i <= n; ++i) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n+1][k+1];

        for(int i = 1; i < dp.length; ++i) {
            for(int w = 1; w < dp[0].length; ++w) {
                // 물건을 넣을 수 없을 때
                if(w < weight[i]) {
                    dp[i][w] = dp[i-1][w];
                    continue;
                }

                // 물건을 넣을 수 있을 때
                dp[i][w] = Math.max(/*넣을 때*/ dp[i - 1][w - weight[i]] + value[i], /*안 넣을 때*/ dp[i - 1][w]);
            }
        }

        System.out.println(dp[n][k]);
    }
}
