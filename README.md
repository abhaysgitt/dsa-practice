# DSA Bootcamp Learning Roadmap

The existing folders are kept in place so their paths and run commands do not change. Use this guide to study the material from foundations to more advanced topics.

## 1. Java foundations

1. [`01-first-java-program/`](./01-first-java-program/) — variables, input/output, primitive types, and simple programs.
2. [`02-conditions-loops/`](./02-conditions-loops/) — conditions, loops, and basic problem-solving.
3. [`03-methods/`](./03-methods/) — methods, parameters, scope, and method overloading.
4. [`09-strings/`](./09-strings/) — Java strings and common string operations.
5. [`10-patterns/`](./10-patterns/) — nested loops and pattern-printing practice.
6. [`14-oop/`](./14-oop/) — classes, objects, inheritance, interfaces, and other Java OOP features.

### Optional Java topics

These are useful Java language and programming topics, but are not a step in DSA difficulty:

- [`18-StringBuffer/`](./18-StringBuffer/) — `StringBuffer` and generating strings.
- [`20-file handling/`](./20-file%20handling/) — reading and writing files.

## 2. Core DSA foundations

7. [`05-arrays/`](./05-arrays/) — arrays, multidimensional arrays, and array lists.
8. [`06-linear search/`](./06-linear%20search/) — linear search and basic array problems.
9. [`07-binary search/`](./07-binary%20search/) — binary search and its variations.
10. [`08-sorting/`](./08-sorting/) — cyclic sort and problems based on sorting.
11. [`12-complexity/`](./12-complexity/) — introductory time and space complexity.
12. [`13-math/`](./13-math/) — number theory, bitwise operations, and related problems.
13. [`11-recursion/`](./11-recursion/) — recursion, recursive sorting, strings, and backtracking.

## 3. Data structures and advanced algorithms

14. [`15-linkedlist/`](./15-linkedlist/) — singly, doubly, and circular linked lists.
15. [`16-stacks-queues/`](./16-stacks-queues/) — stacks, queues, and related problems.
16. [`22-hashmaps/`](./22-hashmaps/) — hash maps and hashing algorithms.
17. [`17-trees/`](./17-trees/) — binary search trees, AVL trees, and segment trees.
18. [`21-heaps/`](./21-heaps/) — heap data structures and problems.
19. [`23-advance-sorting/`](./23-advance-sorting/) — advanced sorting algorithms.
20. [`24-huffman-coding/`](./24-huffman-coding/) — Huffman coding and compression concepts.
21. [`25-sqrt-decomposition/`](./25-sqrt-decomposition/) — square-root decomposition.

The original directory numbers are preserved; the order above is a suggested study sequence, not a claim that every topic has only one prerequisite.

## Running examples

Open a terminal in the folder containing the program. Compile its Java files, then run the class that contains the `main` method. For example:

```bash
cd 01-first-java-program
javac Basics.java
java Basics
```

Not every Java file is a standalone program: some files define helper classes or algorithms and need to be used by a class with a `main` method.
