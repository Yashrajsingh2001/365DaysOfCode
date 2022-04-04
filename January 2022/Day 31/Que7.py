# https://www.codechef.com/problems/UTKPLC
# Problem Code: UTKPLC



# cook your dish here
T = int(input())
while T>0:
    c1,c2,c3 = input().split()
    
    dic = {c1:1, c2:2, c3:3}
    x,y = input().split()
    if dic[x] < dic[y]:
        print(x)
    else:
        print(y)
    T-=1