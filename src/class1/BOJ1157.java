package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cnt = new int[26];
        boolean[] isMaximum = new boolean[26];

        char[] alphabet = br.readLine().toCharArray();

        int max = 0;
        for(char c : alphabet) {
            int idx = Character.toLowerCase(c) - 'a';
            ++cnt[idx];
            max = Math.max(max, cnt[idx]);
        }

        StringBuilder candidates = new StringBuilder();
        for(int i = 0; i < cnt.length; ++i) {
            if(cnt[i] == max) {
                if(isMaximum[i]) continue;
                candidates.append((char)('A' + i));
            }
        }

        System.out.println((candidates.length() > 1) ? "?" : candidates);
    }
}
