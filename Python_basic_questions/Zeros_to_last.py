n = int(input())
arr = list(map(int,input().split()))
index = 0
for num in arr:
    if num != 0:
        arr[index] = num
        index += 1
while index < n:
    arr[index] = 0
    index += 1
print(*arr)


    
