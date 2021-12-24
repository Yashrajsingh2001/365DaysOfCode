# Que LINK: https://www.hackerrank.com/challenges/diagonal-difference/problem

def diagonalDifference(arr):
    # Write your code here
    l, r = 0, 0
    for i in range(len(arr)):
        l += arr[i][i]
        r += arr[i][-i-1]
    return abs(l-r)