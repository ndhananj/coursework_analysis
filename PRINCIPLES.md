# Theoretical Principles by Problem

## topic1_arrays
- **AVeryBigSum**: Use accumulation with 64-bit arithmetic to avoid integer overflow. Objects: vector `a ∈ ℤⁿ`; Operation: associative addition in `ℤ₆₄`.
- **DesinerPDFViewer**: Map characters to indices and apply max aggregation over letter heights. Objects: mapping `h: Σ→ℕ`, word `w ∈ Σ*`; Operation: `max_{c∈w} h(c) * |w|`.
- **LeftRotation**: Apply modular index arithmetic to remap positions in O(n) time without extra rotations. Objects: vector `a ∈ Xⁿ`; Operation: `b[i]=a[(i+d) mod n]`.
- **SparseArray**: Use hash-based frequency counting for O(n + q) lookup of string occurrences. Objects: multiset `S`, queries `Q`; Operation: hash map `f: string→ℕ`, output `f(q)`.

## topic2_lists
- **InsertNodeAtTail**: Traverse to tail and update next pointer; handles null head initialization. Objects: singly linked list `L`; Operation: set `next=nil→node(data)`.
- **InsertNodePositionGiven**: Maintain positional traversal with pointer rewiring at the target index. Objects: list `L`, position `p`; Operation: advance `p` steps, splice node.
- **IsCycle**: Detect cycles via hashing node references or Floyd’s tortoise-and-hare two-pointer method. Objects: node graph `G`; Operations: visited-set membership or pointer iterates `(slow, fast)`.
- **MergeTwoSortedLinkedLists**: Perform linear-time merge by advancing the pointer on the list with the smaller head. Objects: sorted lists `A,B`; Operation: iterative min selection for stable merge.

## topic3_stacks_queues
- **BalancedBrackets**: Use a stack to enforce LIFO matching of opening and closing brackets with early rejection. Objects: string `s`; Operation: push opens, pop/match closes, reject on mismatch/underflow.
- **QueueUsingTwoStacks**: Implement amortized O(1) queue by reversing stacks on demand (dequeue/peek) to preserve order. Objects: stacks `S_in, S_out`; Operation: push enqueues, lazy transfer for dequeues/peeks.
- **Waiter**: Partition with successive primes and stacks; prime generation drives divisibility filtering per iteration. Objects: stack of plates, primes `p_i`; Operation: partition by `p_i` into `B_i` and residual stack, output `B_i` top-down.

## topic4_hashmaps
- **ColorfulNumber**: Generate all contiguous digit products and enforce uniqueness via a hash set. Objects: digit sequence; Operation: compute products of substrings, check set uniqueness.
- **IceCreamParlor**: Use complement lookup (`m - cost`) in a hash map to find a valid pair in linear time. Objects: costs array, budget `m`; Operation: hash map `cost→indices` for complement search.
- **MigratoryBirds**: Count frequencies in fixed-size buckets (types 1–5) and choose the smallest ID on ties. Objects: bounded-type multiset; Operation: fixed-array counts, argmax with tie-break.
- **MissingNumbers**: Use offset-based counting (or hashmap) to track frequency differences and report positives in sorted order. Objects: arrays `A,B`; Operation: offset index counts of `B-A`, report positive entries ascending.

## topic5_sorting
- **CorrectnessAndTheLoopInvariant**: Maintain insertion sort’s loop invariant (prefix sorted) to prove correctness and achieve O(n²) worst case. Objects: array `A`; Operation: insertion maintaining invariant “`A[0..i]` sorted”.
- **InsertionSortPartI**: Shift larger elements right until the key fits, printing after each shift to illustrate stability. Objects: array with trailing key; Operation: while `A[j-1]>key` shift right, then insert key.
- **InsertionSortPart2**: Iteratively extend the sorted prefix, printing after each insertion step. Objects: array `A`; Operation: for each `i`, insert `A[i]` into sorted prefix, emit array.
- **QuicksortPartI**: Single-pass partition relative to pivot; stable output ordering of left, pivot, right partitions. Objects: array `A`, pivot `p`; Operation: partition into `{x<p}`, `{p}`, `{x≥p}`.

## topic6_trees
- **BinaryTreeInsertion**: BST property guides recursive descent; insert at null child to preserve ordering. Objects: BST; Operation: compare key, recurse, allocate at null child.
- **HeightOfABinaryTree**: Recursively compute max subtree height plus one edge; base height -1 for empty or 0 for leaf edges. Objects: rooted tree; Operation: `height=1+max(children)` base case empty.
- **PostorderTraversal**: Depth-first traversal order left → right → root. Objects: rooted tree; Operation: DFS post-visit emit `(L,R,Root)`.
- **PreorderTraversal**: Depth-first traversal order root → left → right. Objects: rooted tree; Operation: DFS pre-visit emit `(Root,L,R)`.
- **Qheap1**: Min-heap supports O(log n) insert/delete and O(1) min retrieval; direct remove requires heap-aware delete by value. Objects: min-heap; Operation: `insert(v)`, `delete(v)`, `min()`.
- **SwapNodes**: Use node depth to identify multiples of k; swapping children preserves structure before inorder traversal. Objects: binary tree with depth labels; Operation: swap children where `depth mod k=0`, inorder emit.

## topic7_graphs
- **BFSShortestReach**: Breadth-first search on unweighted graph yields shortest-path distances with uniform edge weights. Objects: graph `G`, start `s`; Operation: BFS levels to compute `dist`, unreachable → -1.
- **SnakesAndLadders**: Model board as directed edges for moves and transports; BFS over states minimizes dice throws. Objects: state graph (squares); Operation: BFS over die edges + teleports for min steps.

## topic8_recursion
- **Fibonacci**: Define recurrence F(n)=F(n-1)+F(n-2) with memoization to reduce exponential overlap to linear time. Objects: index `n`; Operation: memoized recurrence evaluation.
- **Print1toNRecursively**: Use recursion stack to defer printing until unwinding for increasing order output. Objects: integer `n`; Operation: call on `n-1`, print on unwind.
