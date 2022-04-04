# Que LINK: https://www.hackerrank.com/challenges/apple-and-orange/problem

def countApplesAndOranges(s, t, a, b, apples, oranges):
    # Write your code here
    print(sum(s <= a + i <= t for i in apples))
    print(sum(s <= b + i <= t for i in oranges))