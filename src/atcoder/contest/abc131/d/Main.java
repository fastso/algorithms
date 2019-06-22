package atcoder.contest.abc131.d;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0;i<n;i++) {
            int value = sc.nextInt();
            int key = sc.nextInt();
            m.put(key, value);
        }

        Object[] mapkey = m.keySet().toArray();
        Arrays.sort(mapkey);

        int sum = 0;
        for (Integer nKey : m.keySet())
        {
            sum+=m.get(nKey);
            if (sum > nKey){
                System.out.print("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
