n = int(input())
arr = list(map(int,input().split()))
freq = {}
for num in arr:
    if num in freq:
        freq[num] += 1
    else:
        freq[num] = 1
for num in range(1,n+1):
    if num not in freq:
        print(num)
        break
        
    
