n = int(input())
arr = list(map(int,input().split()))

unique = set(arr)
total = 0
for num in unique:
    total = total + num
print(total)
