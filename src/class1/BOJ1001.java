package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] aAndB = input.split(" ");

        System.out.println(Integer.parseInt(aAndB[0]) - Integer.parseInt(aAndB[1]));
    }
}
