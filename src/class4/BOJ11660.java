package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] prefixSum = new int[n+1][n+1];

        for(int x = 1; x < n+1; ++x) {
            st = new StringTokenizer(br.readLine());
            for(int y = 1; y < n+1; ++y) {
                prefixSum[x][y] = prefixSum[x-1][y] + prefixSum[x][y-1] - prefixSum[x-1][y-1] + Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; ++i) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            sb.append(prefixSum[x2][y2] - prefixSum[x2][y1-1] - prefixSum[x1-1][y2] + prefixSum[x1-1][y1-1]).append("\n");
        }

        System.out.println(sb);
    }
}
