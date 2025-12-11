# Theoretical Principles by Problem

## topic1_arrays
- **AVeryBigSum**: Use accumulation with 64-bit arithmetic to avoid integer overflow.
- **DesinerPDFViewer**: Map characters to indices and apply max aggregation over letter heights.
- **LeftRotation**: Apply modular index arithmetic to remap positions in O(n) time without extra rotations.
- **SparseArray**: Use hash-based frequency counting for O(n + q) lookup of string occurrences.

## topic2_lists
- **InsertNodeAtTail**: Traverse to tail and update next pointer; handles null head initialization.
- **InsertNodePositionGiven**: Maintain positional traversal with pointer rewiring at the target index.
- **IsCycle**: Detect cycles via hashing node references or Floyd’s tortoise-and-hare two-pointer method.
- **MergeTwoSortedLinkedLists**: Perform linear-time merge by advancing the pointer on the list with the smaller head.

## topic3_stacks_queues
- **BalancedBrackets**: Use a stack to enforce LIFO matching of opening and closing brackets with early rejection.
- **QueueUsingTwoStacks**: Implement amortized O(1) queue by reversing stacks on demand (dequeue/peek) to preserve order.
- **Waiter**: Partition with successive primes and stacks; prime generation drives divisibility filtering per iteration.

## topic4_hashmaps
- **ColorfulNumber**: Generate all contiguous digit products and enforce uniqueness via a hash set.
- **IceCreamParlor**: Use complement lookup (`m - cost`) in a hash map to find a valid pair in linear time.
- **MigratoryBirds**: Count frequencies in fixed-size buckets (types 1–5) and choose the smallest ID on ties.
- **MissingNumbers**: Use offset-based counting (or hashmap) to track frequency differences and report positives in sorted order.

## topic5_sorting
- **CorrectnessAndTheLoopInvariant**: Maintain insertion sort’s loop invariant (prefix sorted) to prove correctness and achieve O(n²) worst case.
- **InsertionSortPartI**: Shift larger elements right until the key fits, printing after each shift to illustrate stability.
- **InsertionSortPart2**: Iteratively extend the sorted prefix, printing after each insertion step.
- **QuicksortPartI**: Single-pass partition relative to pivot; stable output ordering of left, pivot, right partitions.

## topic6_trees
- **BinaryTreeInsertion**: BST property guides recursive descent; insert at null child to preserve ordering.
- **HeightOfABinaryTree**: Recursively compute max subtree height plus one edge; base height -1 for empty or 0 for leaf edges.
- **PostorderTraversal**: Depth-first traversal order left → right → root.
- **PreorderTraversal**: Depth-first traversal order root → left → right.
- **Qheap1**: Min-heap supports O(log n) insert/delete and O(1) min retrieval; direct remove requires heap-aware delete by value.
- **SwapNodes**: Use node depth to identify multiples of k; swapping children preserves structure before inorder traversal.

## topic7_graphs
- **BFSShortestReach**: Breadth-first search on unweighted graph yields shortest-path distances with uniform edge weights.
- **SnakesAndLadders**: Model board as directed edges for moves and transports; BFS over states minimizes dice throws.

## topic8_recursion
- **Fibonacci**: Define recurrence F(n)=F(n-1)+F(n-2) with memoization to reduce exponential overlap to linear time.
- **Print1toNRecursively**: Use recursion stack to defer printing until unwinding for increasing order output.
