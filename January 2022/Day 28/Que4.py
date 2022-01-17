# https://www.codechef.com/problems/TYRES
# Problem Code: TYRES

# cook your dish here
T = int(input())
for _ in range(T):
    N = int(input())
    print('YES') if N%4 != 0 else print('NO')