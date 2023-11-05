package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[n+1];

        for(int i = 0; i <= n; ++i) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < n - 1; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int[] parents = new int[n + 1];

        Queue<Integer> q = new LinkedList<>();

        q.add(1);

        while (!q.isEmpty()) {
            int parent = q.poll();
            for(int child : graph[parent]) {
                if(parents[child] != 0) continue;
                parents[child] = parent;
                q.add(child);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 2; i < parents.length; ++i) {
            sb.append(parents[i]).append("\n");
        }
        System.out.println(sb);
    }
}
