package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] adjMatrix = new int[n+1][n+1];

        for(int i = 0; i < m; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            adjMatrix[s][d] = (adjMatrix[s][d] == 0) ? c : Math.min(adjMatrix[s][d], c);
        }

        for(int v = 1; v <= n; ++v) {
            for(int s = 1; s <= n; ++s) {
                if(v == s || adjMatrix[s][v] == 0) continue;
                for(int d = 1; d <= n; ++d) {
                    if(s == d || v == d || adjMatrix[v][d] == 0) continue;
                    adjMatrix[s][d] = (adjMatrix[s][d] == 0) ? adjMatrix[s][v] + adjMatrix[v][d] : Math.min(adjMatrix[s][v] + adjMatrix[v][d], adjMatrix[s][d]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int r = 1; r <= n; ++r) {
            for(int c = 1; c <= n; ++c) {
                sb.append(adjMatrix[r][c]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
