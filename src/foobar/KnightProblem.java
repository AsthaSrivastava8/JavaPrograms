package foobar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pos = sc.nextLine().split(", ");
        int start = Integer.parseInt(pos[0]);
        int end = Integer.parseInt(pos[1]);

        Solution obj = new Solution();
        int ans = obj.solution(start, end);
        System.out.println(ans);
    }
}

class Solution {
    static int min = Integer.MAX_VALUE;

    static class Pair {
        int x;
        int y;
        int count;

        Pair(int a, int b, int c) {
            this.x = a;
            this.y = b;
            this.count = c;
        }
    }

    static boolean isSafe(int row, int col, boolean[][] visited) {
        return row > -1 && col > -1 && row < 8 && col < 8 && !visited[row][col];
    }


    public static int solution(int src, int dest) {
        int x1 = src / 8;
        int y1 = src - (x1 * 8);
        int[] KnightPos = {x1 + 1, y1 + 1};
        int x2 = dest / 8;
        int y2 = dest - (x2 * 8);
        int[] TargetPos = {x2 + 1, y2 + 1};
        boolean[][] visited = new boolean[8][8];
        Queue<Pair> queue = new LinkedList<>();
        int[] dx = new int[]{2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = new int[]{1, -1, 1, -1, 2, -2, -2, 2};
        queue.add(new Pair(KnightPos[0] - 1, KnightPos[1] - 1, 0));

        while (!queue.isEmpty()) {
            Pair x = queue.remove();
            if (x.x == TargetPos[0] - 1 && x.y == TargetPos[1] - 1)
                return x.count;
            for (int i = 0; i < 8; i++) {
                int a = x.x + dx[i];
                int b = x.y + dy[i];
                if (isSafe(a, b, visited)) {
                    visited[a][b] = true;
                    queue.add(new Pair(a, b, x.count + 1));
                }
            }
        }
        return min;
    }
}