n = int(input())
if n == 0:
    count = 1
else:
    count = 0
    while n > 0:
        count += 1
        n = n // 10
print(count)
