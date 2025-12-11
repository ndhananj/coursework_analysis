# Problem Statements

## topic1_arrays
- **AVeryBigSum**: Input: integer `n`, followed by `n` 64-bit integers. Output: the sum of the integers as a 64-bit value.
- **DesinerPDFViewer**: Input: 26 integers for letter heights `h[0..25]` and a lowercase word. Output: area of the highlighted rectangle = `maxHeight(word) * wordLength`.
- **LeftRotation**: Input: integers `n`, `d`, and an array of `n` integers. Output: the array after `d` left rotations, space-separated.
- **SparseArray**: Input: integer `n` strings; integer `q`; then `q` query strings. Output: for each query, the count of its occurrences, each on a new line.

## topic2_lists
- **InsertNodeAtTail**: Input: head of a singly linked list (nullable) and integer `data`. Output: head after appending `data` to the tail.
- **InsertNodePositionGiven**: Input: head of a singly linked list, integer `data`, and zero-based `position`. Output: head after inserting `data` at `position`.
- **IsCycle**: Input: head of a singly linked list. Output: boolean/flag indicating whether the list contains a cycle.
- **MergeTwoSortedLinkedLists**: Input: heads of two sorted singly linked lists. Output: head of one merged ascending list.

## topic3_stacks_queues
- **BalancedBrackets**: Input: integer `t`, then `t` strings of brackets. Output: `YES` if a string is balanced and properly nested; otherwise `NO` (one per line).
- **QueueUsingTwoStacks**: Input: integer `q` followed by `q` commands (`1 x` enqueue, `2` dequeue, `3` print front). Output: value printed for each type-3 command.
- **Waiter**: Input: integers `n`, `q`, then `n` plate numbers (top to bottom). Output: after each of `q` prime-partition iterations, print plates from each `B` stack (top to bottom) in order, then the remaining stack.

## topic4_hashmaps
- **ColorfulNumber**: Input: integer `A`. Output: `1` if products of all contiguous digit subsequences are unique; otherwise `0`.
- **IceCreamParlor**: Input: integer `t` test cases; for each: budget `m`, count `n`, and costs array. Output: 1-based indices of two costs summing to `m`, ascending per case.
- **MigratoryBirds**: Input: integer `n` and `n` sightings (types 1–5). Output: most frequent type; choose the smallest ID on ties.
- **MissingNumbers**: Input: arrays `arr` (length `n`) and `brr` (length `m ≥ n`). Output: sorted numbers missing from `arr` relative to `brr`, space-separated.

## topic5_sorting
- **CorrectnessAndTheLoopInvariant**: Input: integer `n` and array of `n` integers. Output: fully sorted array using insertion sort, space-separated.
- **InsertionSortPartI**: Input: integer `n` and array with the last element potentially unsorted. Output: arrays printed after each shift and after final insertion.
- **InsertionSortPart2**: Input: integer `n` and array. Output: arrays printed after each insertion step of insertion sort.
- **QuicksortPartI**: Input: integer `n` and array. Output: elements printed as partitioned around the first element (left elements, pivot, right elements).

## topic6_trees
- **BinaryTreeInsertion**: Input: root of a BST (nullable) and integer `value`. Output: root after inserting `value` respecting BST order.
- **HeightOfABinaryTree**: Input: root of a binary tree. Output: height = number of edges on the longest root-to-leaf path.
- **PostorderTraversal**: Input: root of a binary tree. Output: node values in postorder (left, right, root), space-separated.
- **PreorderTraversal**: Input: root of a binary tree. Output: node values in preorder (root, left, right), space-separated.
- **Qheap1**: Input: integer `q`, then `q` operations (`1 v` insert, `2 v` delete, `3` print min). Output: minimum value for each type-3 operation, one per line.
- **SwapNodes**: Input: integer `n` with pairs of child indices for nodes 1..n, then integer `t` queries `k`. Output: inorder traversal after each swap of nodes at depths multiple of `k`, one line per query.

## topic7_graphs
- **BFSShortestReach**: Input: integer `T`; for each, integers `n`, `m`, `m` undirected edges, and start node `s`. Output: shortest distances from `s` to all other nodes (edge weight 6) or `-1` if unreachable, listed in node order excluding `s`.
- **SnakesAndLadders**: Input: integer `T`; for each, ladder count with start/end pairs, snake count with start/end pairs. Output: minimum dice throws to reach square 100, or `-1` if impossible.

## topic8_recursion
- **Fibonacci**: Input: integer `n`. Output: the `n`th Fibonacci number.
- **Print1toNRecursively**: Input: integer `t`, then `t` values `n`. Output: numbers `1..n` in increasing order on each line.
