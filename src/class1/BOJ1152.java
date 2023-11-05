package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        input = input.trim();

        if(input.isEmpty()) {
            System.out.println(0);
            System.exit(0);
        }

        int answer = 0;

        for(int i = 0; i < input.length(); ++i) {
            if(input.charAt(i) == ' ') ++answer;
        }

        System.out.println(answer);
    }
}
