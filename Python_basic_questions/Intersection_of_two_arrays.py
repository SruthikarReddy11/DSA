n = int(input())
arr1 = list(map(int,input().split()))
m = int(input())
arr2 = list(map(int,input().split()))
set1 = set(arr1)
intersection = set()
for num in arr2:
    if num in arr1:
        intersection.add(num)
print(*intersection)
