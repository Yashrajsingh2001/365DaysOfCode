# https://www.codechef.com/problems/DISABLEDKING
# Problem Code: DISABLEDKING


# cook your dish here
T = int(input())
for _ in range(T):
    n = int(input())
    print(n) if n%2==0 else print(n-1)