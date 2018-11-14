# AVeryOddProblem
Solution to a code challenge

Introduction

As part of his religion, your friend hates odd numbers and empty arrays. He hates odd numbers and empty arrays so much that whenever he encounters an array, he tries to remove some values such that the resulting array has an even sum. Furthermore, the resulting array must contain a non zero even amount of even numbers after the transformation. When your friend can not remove any values from the array such that the array satisfies the conditions given before, he becomes insane. Being a good friend, you decide to check whether it is safe to give your friend an array.

Input Specifications

The first line contains n (1 <= n <= 10'000), the number of values in the array. The next line contains 'n' space separated integers, the n elements of the array. Every value is contained in the closed interval [0; 999'999].

Output Specifications

Print "YES" if it is safe to give your friend the array. Otherwise, print "NO".

Sample Input/Output 

Input
5
44581

Output
YES

Explanation - Your friend can remove all values except 4 and 4. Alternatively, he could have also kept values 4 and 8 or the other 4 and 8.

Input
4
1235

Output
NO

Explanation - No matter which elements your friend removes, he will never have a non zero even number of even values remaining.
