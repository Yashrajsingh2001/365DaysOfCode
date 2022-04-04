# https://www.codechef.com/problems/CHFRICH
# Problem Code: CHFRICH


# cook your dish here
T = int(input())
for _ in range(T):
    A, B, X = list(map(int, input().rstrip().split()))
    print(int((B-A)/X))