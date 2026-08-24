import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            int n = sc.nextInt();
            count++;

            if (n % 2 != 0) {
                break;
            }
        }

        System.out.println(count);
    }
}
