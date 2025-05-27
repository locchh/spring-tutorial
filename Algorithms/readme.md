# 📘 Time and Space Complexity

## Introduction

When analyzing an algorithm, two important aspects are considered:

* **Time Complexity**: How the computation time grows with input size.
* **Space Complexity**: How much memory is required for the algorithm to run.

These are expressed using **Big O notation**, which describes the **upper bound** of growth in the worst-case scenario.

---

## ⏱ Time Complexity

### Definition:

Time complexity measures the number of **basic operations** the algorithm performs as a function of input size `n`.

### Common Time Complexities:

| Complexity | Name              | Example Use Case                       |
| ---------- | ----------------- | -------------------------------------- |
| O(1)       | Constant time     | Accessing an array element             |
| O(log n)   | Logarithmic time  | Binary search                          |
| O(n)       | Linear time       | Linear search                          |
| O(n log n) | Linearithmic time | Merge sort, quicksort (avg case)       |
| O(n²)      | Quadratic time    | Bubble sort, selection sort            |
| O(2ⁿ)      | Exponential time  | Recursive Fibonacci                    |
| O(n!)      | Factorial time    | Solving Traveling Salesman brute-force |

### Example – Linear Search:

```java
public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;
        }
    }
    return -1;
}
```

* **Time Complexity**: O(n) — In the worst case, every element must be checked.
* **Best Case**: O(1) — If the element is at the beginning.
* **Average Case**: O(n/2), but we simplify to O(n) for asymptotic notation.

---

## 💾 Space Complexity

### Definition:

Space complexity measures the **amount of memory** the algorithm needs to execute relative to the input size `n`.

This includes:

* Input space (sometimes excluded),
* Auxiliary space (extra memory allocated during execution).

### Common Space Complexities:

| Complexity | Meaning                       |
| ---------- | ----------------------------- |
| O(1)       | Constant space                |
| O(n)       | Linear space                  |
| O(n²)      | Matrix or 2D-array operations |

### Example – Linear Search:

```java
public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;
        }
    }
    return -1;
}
```

* **Space Complexity**: O(1) — No extra memory is used besides variables like `i` and `target`.

---

## 🔁 Tips to Reduce Complexity

* Use efficient data structures (e.g., hash maps for O(1) lookups).
* Eliminate redundant calculations.
* Avoid unnecessary nested loops.
* Use memoization or dynamic programming to reuse subproblem results.

---

## 📌 Summary

| Term             | Definition                                  | Unit         |
| ---------------- | ------------------------------------------- | ------------ |
| Time Complexity  | Growth of operation count w\.r.t input size | Basic steps  |
| Space Complexity | Growth of memory usage w\.r.t input size    | Bytes/Memory |

Understanding time and space complexity helps you:

* Write scalable code.
* Choose the best algorithm for your use case.
* Optimize performance.