n = int(input())

arr = list(map(int, input().split()))

small = float('inf')
sec = float('inf')

for i in arr:
    if i < small:
        sec = small
        small = i
    elif i > small and i < sec:
        sec = i

print(sec)
