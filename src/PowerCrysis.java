import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerCrysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            System.out.println(findMinimumM(N));
        }
        sc.close();
    }

    private static int findMinimumM(int N) {
        for (int m = 1; ; m++) {
            List<Integer> regions = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                regions.add(i);
            }
            int current = 0;
            while (regions.size() > 1) {
                regions.remove(current);
                if (regions.isEmpty()) break;
                current = (current + m - 1) % regions.size();
            }
            if (regions.get(0) == 13) {
                return m;
            }
        }
    }
}
