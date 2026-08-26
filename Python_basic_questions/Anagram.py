str1 = input()
str2 = input()
if len(str1) != len(str2):
    print("Not Anagram")
else:
    frequency = {}
    for char in str1:
        if char in frequency:
            frequency[char] += 1
        else:
            frequency[char] = 1
    
    for char in str2:
        if char in frequency:
            frequency[char] -= 1
        else:
            print("Not Anagram")
    else:
        if all(value == 0 for value in frequency.values()):
            print("Anagram")
        else:
            print("Not Anagram")
