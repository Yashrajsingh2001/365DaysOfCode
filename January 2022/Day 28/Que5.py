# https://www.codechef.com/problems/COCONUT
# Problem Code: COCONUT


# cook your dish here
T = int(input())
for _ in range(T):
    xa, xb, Xa, Xb = list(map(int, input().rstrip().split()))
    print(int(Xa/xa + Xb/xb))