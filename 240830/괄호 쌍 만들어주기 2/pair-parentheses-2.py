arr = list(input())
#print(arr)
cnt =0
for i in range(len(arr)-3):
    for j in range(i+2, len(arr)-1):
        if(arr[i] == "(" and arr[i+1] =="(" and arr[j]==")" and arr[j+1]==")"):
            cnt +=1

print(cnt)