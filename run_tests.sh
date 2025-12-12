#!/usr/bin/env bash
set -e

declare -A FILES=(
  [AVeryBigSum]=topic1_arrays/AVeryBigSum.java
  [DesinerPDFViewer]=topic1_arrays/DesinerPDFViewer.java
  [LeftRotation]=topic1_arrays/LeftRotation.java
  [SparseArray]=topic1_arrays/SparseArray.java
  [InsertNodeAtTail]=topic2_lists/InsertNodeAtTail.java
  [InsertNodePositionGiven]=topic2_lists/InsertNodePositionGiven.java
  [IsCycle]=topic2_lists/IsCycle.java
  [MergeTwoSortedLinkedLists]=topic2_lists/MergeTwoSortedLinkedLists.java
  [BalancedBrackets]=topic3_stacks_queues/BalancedBrackets.java
  [QueueUsingTwoStacks]=topic3_stacks_queues/QueueUsingTwoStacks.java
  [Waiter]=topic3_stacks_queues/Waiter.java
  [ColorfulNumber]=topic4_hashmaps/ColorfulNumber.java
  [IceCreamParlor]=topic4_hashmaps/IceCreamParlor.java
  [MigratoryBirds]=topic4_hashmaps/MigratoryBirds.java
  [MissingNumbers]=topic4_hashmaps/MissingNumbers.java
  [CorrectnessAndTheLoopInvariant]=topic5_sorting/CorrectnessAndTheLoopInvariant.java
  [InsertionSortPartI]=topic5_sorting/InsertionSortPartI.java
  [InsertionSortPart2]=topic5_sorting/InsertionSortPart2.java
  [QuicksortPartI]=topic5_sorting/QuicksortPartI.java
  [Qheap1]=topic6_trees/Qheap1.java
  [PreorderTraversal]=topic6_trees/PreorderTraversal.java
  [PostorderTraversal]=topic6_trees/PostorderTraversal.java
  [SwapNodes]=topic6_trees/SwapNodes.java
  [HeightOfABinaryTree]=topic6_trees/HeightOfABinaryTree.java
  [BinaryTreeInsertion]=topic6_trees/BinaryTreeInsertion.java
  [BFSShortestReach]=topic7_graphs/BFSShortestReach.java
  [SnakesAndLadders]=topic7_graphs/SnakesAndLadders.java
  [Print1toNRecursively]=topic8_recursion/Print1toNRecursively.java
  [Fibonacci]=topic8_recursion/Fibonacci.java
)

pass=0
fail=0

for name in \"${!FILES[@]}\"; do
  in_file=\"tests/${name}.in\"
  out_file=\"tests/${name}.out\"
  if [[ ! -f \"$in_file\" || ! -f \"$out_file\" ]]; then
    echo \"[SKIP] $name (missing input/output)\"
    continue
  fi
  actual=$(make -s run file=\"${FILES[$name]}\" input=\"$in_file\")
  expected=$(cat \"$out_file\")
  if [[ \"$actual\" == \"$expected\" ]]; then
    echo \"[PASS] $name\"
    ((pass++))
  else
    echo \"[FAIL] $name\"
    echo \"Expected:\\n$expected\\nGot:\\n$actual\"
    ((fail++))
  fi
done

echo \"----\"
echo \"Passed: $pass  Failed: $fail\"
exit $fail
