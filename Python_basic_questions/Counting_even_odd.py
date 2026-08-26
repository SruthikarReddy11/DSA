n = int(input())
arr = list(map(int,input().split()))
even = 0
odd = 0
for i in range(0,n):
    if i % 2 == 0:
        even += 1
    else:
        odd += 1
print("Even:",even)
print("Odd:",odd)
