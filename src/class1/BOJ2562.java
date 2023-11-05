package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[9];
        for(int i = 0; i < nums.length; ++i) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int[] tmp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tmp);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == tmp[8]) {
                System.out.println(tmp[8]);
                System.out.println(i + 1);
                System.exit(0);
            }
        }
    }
}
