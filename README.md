# lab-6-sorting

## Background
There are many ways to sort. Some are better than others. In this lab, you will be implementing a new sort I just invented: Valley Sort. It's new, but perhaps not the most optimal.

## Part 1: Find the index of the lowest value  (10 pts: 8 code, 2 question)
Go through the array and find the INDEX of the lowest value. This will be your "midpoint".  If there are multiple lowest values, choose the first one. 

### Reflection Question 1: What is big-O notation for the worst case runtime to find your lowest value?

## Part 2: Left and Right Sorts (20 pts-5 for names, 15 for implementations)
You must use two different N^2 sorts to sort the two different sides of the array, and you must
implement them yourself (no Java libraries). You can use your choice of Bubble Sort,
Selection Sort, or Insertion Sort to sort the left side from hight to low, and then a different one to sort
the right half low to high.

Your sort must operate “in place” - you cannot create any new arrays while you are sorting.
You need to practice good method best pratices. Each of your sorts must be their own
method (HINT: they should probably need to take in parameters for your array and one or more indices that tell
the sort where in the array to stop and/or start). 

Hint: If your method recieves an empty array-it should return that emtpy array as empty arrays are still considered sorted. 

### Reflection Question 2: What is the name of the sort your chose for LeftSort? 

### Reflection Question 3: What is the name of the sort your chose for RightSort?

## Part 3: Merge (15 pts code, 5 pts Q4)
We now want to merge the values in place. In normal mergesort, we could do this by tracking the of both arrays, and swapping values of the next smallest. This is a little different, as one array is in ascending order, and the other array is in descending order, so we can't just copy-paste the merge method that is given to us in the textbook. We need to change it a little. (Besides, copy-pasting isn't any fun and we don't learn anything.)

### Reflection Question 4: How did we have to change the merge method given in the book/class to take into account that our two arrays are in the opposite direction?

## Part 4: Test (40 pts. 4 methods *2 tests/method*5 pts/test )

You need to show us that it works. Create 2 tests for each method in the Main.java method. Be sure you include
* input (1 pt)
* expdected output (1 pt)
* Actual output (1 pt)
* What you are trying to test in a comment. (example: I am testing merging on an array that is already sorted) (2pts) 

The four methods to test are

1) FindLowest
2) SortLeft
3) SortRight
4) Merge
