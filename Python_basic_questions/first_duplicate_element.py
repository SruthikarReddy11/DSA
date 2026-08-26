n = int(input())
arr = list(map(int,input().split()))
visit = set()
for i in arr:
    if i in visit:
        print(i)
        break
    else:
        visit.add(i)
