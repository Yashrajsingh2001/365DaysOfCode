# https://www.codechef.com/problems/CARRANGE
# Problem Code: CARRANGE

# cook your dish here
T = int(input())
for _ in range(T):
    P, M, V = list(map(int, input().rstrip().split()))
    print(V*(M-P+1))