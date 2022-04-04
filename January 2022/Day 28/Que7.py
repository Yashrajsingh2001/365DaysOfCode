# https://www.codechef.com/problems/DEVSPORTS
# Problem Code: DEVSPORTS


# cook your dish here
T = int(input())
for _ in range(T):
    Z,Y,A,B,C = list(map(int, input().rstrip().split()))
    print('YES') if Z-Y-A-B-C>=0 else print('NO')