# https://www.codechef.com/problems/LUCKYFR
# Problem Code: LUCKYFR


# cook your dish here
T = int(input())
for _ in range(T):
    num = input()
    count=0
    for i in num:
        if i=='4':
            count+=1
    print(count)