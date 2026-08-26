n = int(input())
arr = list(map(int,input().split()))
largest = float('-inf')
sec_largest = float('-inf')

for num in arr:
    if num > largest:
        sec_largest = largest
        largest = num
    elif num > sec_largest and num != largest:
        sec_largest = num
print("Largest:",largest)
print("Second Largest:",sec_largest)
