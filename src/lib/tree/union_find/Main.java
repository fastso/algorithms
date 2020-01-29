package lib.tree.union_find;

public class Main {
    public static void main(String... args) {

    }

    static int nCr(int n, int r) {
        int num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}

class UnionFind {
    // 各nodeの親
    int[] parent;
    // 木の深さ
    int[] rank;
    // 木のサイズ
    int[] size;

    /**
     * すべてのnodeをrootに初期化する。
     *
     * @param n
     */
    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
            rank[i] = 0;
            size[i] = 1;
        }
    }

    /**
     * xのrootを求める。
     *
     * @param x
     * @return
     */
    public int root(int x) {
        if (parent[x] < 0) {
            return x;
        } else {
            return root(parent[x]);
        }
    }

    /**
     * xとyの木を合併する。
     *
     * @param x
     * @param y
     */
    public void unite(int x, int y) {
        x = root(x);
        y = root(y);
        if (x == y) return;
        if (rank[x] > rank[y]) {
            parent[y] = x;
            size[x] += size[y];
        } else {
            parent[x] = y;
            if (rank[x] == rank[y]) {
                rank[y]++;
            }
            size[y] += size[x];
        }
    }

    /**
     * xとyが同じrootかを判定する。
     *
     * @param x
     * @param y
     * @return
     */
    public boolean same(int x, int y) {
        return root(x) == root(y);
    }

    /**
     * 木のサイズを求める。
     *
     * @param x
     * @return
     */
    public int getSize(int x) {
        return size[root(x)];
    }
}
