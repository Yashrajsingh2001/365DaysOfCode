# https://www.codechef.com/problems/BLITZ3_2
# Problem Code: BLITZ3_2


# cook your dish here
T = int(input())
for _ in range(T):
    N, A, B = list(map(int, input().rstrip().split()))
    print(2*(180+N) - (A+B))