# Algorithms and Data Structures / 算法和数据结构 / アルゴリズムとデータ構造

## 1. Programming Contest

## 2. アルゴリズムと計算量

## 3. 初等的整列

## 4. データ構造

## 5. 探索

## 6. Recursion and Divide-and-conquer Method / 再帰・分割統治法

### Recursion and Divide-and-conquer / 再帰と分割統治

1. 与えられた問題を部分問題に「分割」する。
1. 部分問題を再帰的に解く。
1. 得られた部分問題の解を「統合」して、元の問題を解く。

Two important things of implementing a recursion function:

1. Base Case / ベースケース
1. Recurrence Relation / 漸化式

### Exhaustive Search(Brute-force Search) / 全探索

### Koch Curve / コッホ曲線

## 7. 高等的整列

## 8. Tree / 木

### 木構造の概要

* 木構造
節点(node)と節点同士を結ぶ辺(edge)で表されるデータ構造です。

* 根付き木(Rooted Tree)
根(root)と呼ばれる他と区別された一つの節点を持つ木です。

* 外部節点(External node) 葉(Leaf)
子を持たない節点のことです。

* 次数(Degree)
根付き木の節点の子の数を次数と呼びます。

* 深さ(Depth)
根から節点までの経路の長さを深さと呼びます。

* 高さ(Height)
節点から葉までの経路の長さの最大値を高さと呼びます。

### 根付き木の表現

### 二分木の表現

### 木の巡回

### 木の巡回の応用：木の復元

未完了

## 9. 二分探索木

## 10. ヒープ

## 11. Dynamic Programming / 動的計画法

### 動的計画法の概要

* 動的計画法
ある計算式に対して、一度計算した結果をメモリに記録しておき、同じ計算を繰り返し行うという無駄を避けつつ、
それらを再利用することにより効率化を図ることは、プログラミングやアルゴリズムの設計を行う上で有効なアプローチとなります。
その手法のひとつが動的計画法です。

### Fibonacci number / フィボナッチ数列

```java
// メモ化再帰によるフィボナッチ数列
fibonacci(n)
  if n==0 || n == 1
    return F[n] = 1
  if F[n] が計算済み
    return F[n]
  return F[n] = fibonacci(n-2) + fibonacci(n-1)
```

```java
// 動的計画法によるフィボナッチ数列
fibonacci(n)
  F[0] = 1
  F[1] = 1
  for i が 2 から n まで
    F[i] = F[i-2] + F[i-1]
```

### PLS (Longest Common Subsequence problem) / 最長共通部分列

### 連鎖行列積

## 12. グラフ

### グラフとは

### グラフの表現

### 深さ優先探索

### 幅優先探索


### 連携津成分

## 13. 重み付きグラフ

## 14. 高度なデータ構造

## 15. 高度なグラフアルゴリズム

## 16. 計算幾何学

## 17. 動的計画法

## 18. 整数論

## 19. ヒューリスティック探索






-----------------------------------------------

## Algorithms / 算法 / アルゴリズム

### Sorting

#### Insertion Sort

### Searching

### Graphs

#### Depth-First Search / 深度优先搜索 / 深さ優先探索

### Strings

### Context

### Mathematics

### permutation / 排列 / 順列

### combination / 组合 / 組合せ

## Data Structures / 数据结构 / データ構造

### List

### Associative Array

### Set

### Tree / 树 / 木

#### Union-Find Tree / 并查集 / Union-Find木

### Graph

