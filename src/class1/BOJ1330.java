package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] aAndB = br.readLine().split(" ");

        int a = Integer.parseInt(aAndB[0]);
        int b = Integer.parseInt(aAndB[1]);

        System.out.println((a == b) ? "==" : ((a > b) ? ">" : "<"));
    }
}
