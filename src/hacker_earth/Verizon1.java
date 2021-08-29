package hacker_earth;

import java.io.*;
import java.util.*;

public class Verizon1 implements Runnable {
    public static void main(String[] args) {
        new Thread(null, new Verizon1(), "thread", 1 << 28).start();
    }

    public void run() {
        PrintWriter w = new PrintWriter(System.out);
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long[] x = new long[n];
        long[] h = new long[n];
        building[] b = new building[n];
        String [] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(first[i]);
            h[i] = Integer.parseInt(second[i]);
            b[i] = new building();
            b[i].x = x[i];
            b[i].h = h[i];
            b[i].id = i;
        }
        Arrays.sort(b, new cmp());
        long[] coordinates = new long[n];
        long[] dp = new long[n];
        dp[n - 1] = b[n - 1].x + b[n - 1].h;
        initialize(n);
        coordinates[b[n - 1].id] = dp[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            long can = b[i].x + b[i].h;
            int ind = -1;
            int l = i;
            int r = n - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (b[mid].x <= can) {
                    ind = mid;
                    l = mid + 1;
                } else r = mid - 1;
            }
            dp[i] = Math.max(dp[i], b[i].x + b[i].h);
            if (ind != -1) {
                dp[i] = Math.max(dp[i], get(1, n, i + 1, ind, 1));
            }
            coordinates[b[i].id] = dp[i];
            update(1, n, 1, dp[i], i);
        }
        for (int i = 0; i < n; i++) w.println(coordinates[i]);

        w.close();
    }

    static class cmp implements Comparator<building> {
        public int compare(building o1, building o2) {
            return o1.x < o2.x
                    ? -1
                    : o1.x > o2.x
                    ? 1
                    : o1.h < o2.h
                    ? -1
                    : o1.h > o2.h
                    ? 1
                    : 0;
        }
    }

    static class building {
        long x, h;
        int id;
    }

    long[] x;

    long merge(long a, long b) {
        return Math.max(a, b);
    }

    void initialize(int n) {
        x = new long[4 * n + 1];
    }

    long get(int l, int r, int lr, int rr, int i) {
        if (lr <= l && rr >= r) {
            return x[i];
        }
        if (r < lr || l > rr) {
            return Long.MIN_VALUE;
        }
        int mid = (l + r) / 2;
        return merge(get(l, mid, lr, rr, 2 * i), get(mid + 1, r, lr, rr, 2 * i + 1));
    }

    long update(int l, int r, int i, long dif, int target) {
        if (target < l || target > r) {
            return Long.MIN_VALUE;
        }
        if (l == r) {
            x[i] = dif;
            return x[i];
        }
        int mid = (l + r) / 2;
        update(l, mid, 2 * i, dif, target);
        update(mid + 1, r, 2 * i + 1, dif, target);
        x[i] = merge(x[2 * i], x[2 * i + 1]);
        return x[i];
    }
}
