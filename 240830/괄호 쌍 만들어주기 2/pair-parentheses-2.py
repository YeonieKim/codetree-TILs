arr = list(input())
#print(arr)
o = 0
c = 0
for i in range(len(arr)-1):
    if(arr[i] == "(" and arr[i+1] =="("):
        o += 1
    if(arr[i]==")" and arr[i+1]==")"):
        c += 1

pair_num = o * c
print(pair_num)