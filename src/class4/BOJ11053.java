package class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] LIS = new int[n];
        int length = 0;

        Arrays.fill(LIS, 1001);

        for(int i : arr) {
            int idx = Arrays.binarySearch(LIS, i);
            idx = (idx < 0) ? -idx - 1 : idx;
            LIS[idx] = i;
            length = Math.max(idx, length);
        }

        System.out.println(length + 1);
    }
}
