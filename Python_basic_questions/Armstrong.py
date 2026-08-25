n = int(input())
original = n
total = 0
digits = 0
temp = n
while temp > 0:
    digits += 1
    temp = temp // 10
temp = n
while temp > 0:
    digit = temp % 10
    total = total + digit ** digits
    temp = temp // 10
if total == original:
    print("Amstrong")
else:
    print("Not an Amstrong")
