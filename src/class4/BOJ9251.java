package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "_" + br.readLine();
        String str2 = "_" + br.readLine();

        int[][] dp = new int[str1.length()][str2.length()];

        for(int i = 1; i < str1.length(); ++i) {
            for(int j = 1; j < str2.length(); ++j) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        System.out.println(dp[str1.length() - 1][str2.length()-1]);
    }
}