n = int(input())
arr = list(map(int,input().split()))

large = arr[0]
sec = arr[0]

for i in range(1,n):
    if arr[i] > large:
        sec = large
        large = arr[i]
    elif arr[i] > sec and arr[i] != large:
        sec = arr[i]
print(sec)
