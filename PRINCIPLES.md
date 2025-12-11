# Theoretical Principles by Problem

## topic1_arrays
- **AVeryBigSum**: Use accumulation with 64-bit arithmetic to avoid integer overflow. Inputs: `n`, array of `n` 64-bit ints → Object: vector `a ∈ ℤⁿ` → Operation: associative addition in `ℤ₆₄` → Output: scalar sum.
- **DesinerPDFViewer**: Map characters to indices and apply max aggregation over letter heights. Inputs: heights `h[0..25]`, word `w` → Objects: mapping `h: Σ→ℕ`, word `w ∈ Σ*` → Operation: `max_{c∈w} h(c) * |w|` → Output: highlighted area.
- **LeftRotation**: Apply modular index arithmetic to remap positions in O(n) time without extra rotations. Inputs: `n`, rotation `d`, array → Object: vector `a ∈ Xⁿ` → Operation: `b[i]=a[(i+d) mod n]` → Output: rotated array.
- **SparseArray**: Use hash-based frequency counting for O(n + q) lookup of string occurrences. Inputs: `n` strings, `q` queries → Objects: multiset `S`, queries `Q` → Operation: hash map `f: string→ℕ`, evaluate `f(q)` → Output: counts per query.

## topic2_lists
- **InsertNodeAtTail**: Traverse to tail and update next pointer; handles null head initialization. Inputs: head, `data` → Object: list `L` → Operation: set `next=nil→node(data)` → Output: updated head.
- **InsertNodePositionGiven**: Maintain positional traversal with pointer rewiring at the target index. Inputs: head, `data`, position `p` → Object: list `L` with index `p` → Operation: advance `p` steps, splice node → Output: updated head.
- **IsCycle**: Detect cycles via hashing node references or Floyd’s tortoise-and-hare two-pointer method. Input: head → Object: node graph `G` → Operation: visited-set check or `(slow, fast)` iteration → Output: boolean cycle flag.
- **MergeTwoSortedLinkedLists**: Perform linear-time merge by advancing the pointer on the list with the smaller head. Inputs: heads of sorted lists `A,B` → Objects: lists `A,B` → Operation: iterative min selection to build merged list → Output: merged head.

## topic3_stacks_queues
- **BalancedBrackets**: Use a stack to enforce LIFO matching of opening and closing brackets with early rejection. Inputs: `t` strings → Object: bracket string `s` → Operation: push opens, pop/match closes → Output: YES/NO per string.
- **QueueUsingTwoStacks**: Implement amortized O(1) queue by reversing stacks on demand (dequeue/peek) to preserve order. Inputs: command stream (`1 x`, `2`, `3`) → Objects: stacks `S_in, S_out` representing queue → Operation: enqueue push; dequeue/peek via lazy transfer → Output: values for type-3 commands.
- **Waiter**: Partition with successive primes and stacks; prime generation drives divisibility filtering per iteration. Inputs: `n`, `q`, initial plate stack → Objects: plate stack, prime sequence `p_i` → Operation: per `i`, partition by divisibility into `B_i` and residual → Output: plates printed from `B_i` stacks then remaining stack.

## topic4_hashmaps
- **ColorfulNumber**: Generate all contiguous digit products and enforce uniqueness via a hash set. Input: integer `A` → Object: digit sequence → Operation: substring products uniqueness check → Output: 1/0 flag.
- **IceCreamParlor**: Use complement lookup (`m - cost`) in a hash map to find a valid pair in linear time. Inputs: budget `m`, costs → Objects: costs array, map `cost→indices` → Operation: complement search `m−c` → Output: 1-based index pair.
- **MigratoryBirds**: Count frequencies in fixed-size buckets (types 1–5) and choose the smallest ID on ties. Inputs: `n`, sightings → Object: fixed bucket counts → Operation: argmax with min-ID tie-break → Output: bird type.
- **MissingNumbers**: Use offset-based counting (or hashmap) to track frequency differences and report positives in sorted order. Inputs: arrays `arr`, `brr` → Objects: offset counts of `brr-arr` → Operation: list indices with positive residual → Output: missing numbers ascending.

## topic5_sorting
- **CorrectnessAndTheLoopInvariant**: Maintain insertion sort’s loop invariant (prefix sorted) to prove correctness and achieve O(n²) worst case. Inputs: `n`, array → Object: array `A` → Operation: insertion maintaining “`A[0..i]` sorted” → Output: fully sorted array.
- **InsertionSortPartI**: Shift larger elements right until the key fits, printing after each shift to illustrate stability. Inputs: `n`, array with last key unsorted → Object: array → Operation: shift while `A[j-1]>key`, insert key → Output: intermediate arrays after shifts/insertion.
- **InsertionSortPart2**: Iteratively extend the sorted prefix, printing after each insertion step. Inputs: `n`, array → Object: array `A` → Operation: for each `i`, insert `A[i]` into sorted prefix → Output: arrays after each insertion.
- **QuicksortPartI**: Single-pass partition relative to pivot; stable output ordering of left, pivot, right partitions. Inputs: `n`, array → Object: array `A`, pivot `p` → Operation: partition into `{x<p}`, `{p}`, `{x≥p}` → Output: partitioned sequence printed.

## topic6_trees
- **BinaryTreeInsertion**: BST property guides recursive descent; insert at null child to preserve ordering. Inputs: root, value → Object: BST → Operation: compare/recurse, allocate at null child → Output: updated root.
- **HeightOfABinaryTree**: Recursively compute max subtree height plus one edge; base height -1 for empty or 0 for leaf edges. Input: root → Object: rooted tree → Operation: `height=1+max(children)` → Output: height.
- **PostorderTraversal**: Depth-first traversal order left → right → root. Input: root → Object: rooted tree → Operation: DFS postorder → Output: node values in postorder.
- **PreorderTraversal**: Depth-first traversal order root → left → right. Input: root → Object: rooted tree → Operation: DFS preorder → Output: node values in preorder.
- **Qheap1**: Min-heap supports O(log n) insert/delete and O(1) min retrieval; direct remove requires heap-aware delete by value. Inputs: `q` operations → Object: min-heap → Operation: apply `insert/delete/min` per op → Output: min values for type-3 ops.
- **SwapNodes**: Use node depth to identify multiples of k; swapping children preserves structure before inorder traversal. Inputs: tree definition, queries `k` → Object: binary tree with depth labels → Operation: swap children where `depth mod k=0`, then inorder → Output: inorder per query.

## topic7_graphs
- **BFSShortestReach**: Breadth-first search on unweighted graph yields shortest-path distances with uniform edge weights. Inputs: graph edges, start `s` → Object: graph `G` → Operation: BFS levels (edge weight 6) → Output: distances or -1.
- **SnakesAndLadders**: Model board as directed edges for moves and transports; BFS over states minimizes dice throws. Inputs: ladders/snakes → Object: state graph of squares → Operation: BFS over die edges plus teleports → Output: min dice throws or -1.

## topic8_recursion
- **Fibonacci**: Define recurrence F(n)=F(n-1)+F(n-2) with memoization to reduce exponential overlap to linear time. Input: `n` → Object: index `n` → Operation: memoized recurrence → Output: `F(n)`.
- **Print1toNRecursively**: Use recursion stack to defer printing until unwinding for increasing order output. Inputs: `t`, values `n` → Object: integer `n` → Operation: recurse `n-1`, print on unwind → Output: sequence `1..n`.
