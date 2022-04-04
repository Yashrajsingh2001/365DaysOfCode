# https://www.codechef.com/problems/CALPOWER
# Problem Code: CALPOWER



# cook your dish here
for t in range(int(input())):
    s = input()
    s=sorted(s) # s = ''.join(sorted(s))
    ans = 0
    for i in range(len(s)):
        ans += (ord(s[i]) -96) * (i+1)
        
    print(ans)
        