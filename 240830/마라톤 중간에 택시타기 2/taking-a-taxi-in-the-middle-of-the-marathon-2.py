import sys

INT_MAX = sys.maxsize

n = int(input())
arr = [
    list(map(int, input().split()))
    for _ in range(n)
]

idx =0
distance = 0
min_dist = INT_MAX
for i in range(1, n-1):
    for j in range(1, n):
        if(i == j):
            continue
        distance += abs(arr[idx][0] - arr[j][0]) + abs(arr[idx][1] - arr[j][1])
        #print("i ", i,"j ", j, "distance는 ", distance)
        idx = j
    min_dist = min(min_dist, distance)
    #print(min_dist)
    
print(min_dist)
        


"""
#temp = [0, 0]
distance = 0
#skip = False
min_dist = INT_MAX
idx = 0
for i in range(1,n-1):
    for j in range(1,n):
        if(i==j):
            continue
        distance +=  abs(arr[idx][0]-arr[j][0]) + abs(arr[idx][1]-arr[j][1])
    idx = j

    min_dist = min(min_dist, distance)

print(min_dist)

for i in range(1,n-1):
    for j in range(n-1):
        if not skip:
            temp[0] = arr[i][0]
            temp[1] = arr[i][1]
            arr[i][0] = arr[i-1][0]
            arr[i][1] = arr [i-1][1]
            #print(i, "arr는 ", arr)

        #계산
        distance +=  abs(arr[j][0]-arr[j+1][0]) + abs(arr[j][1]-arr[j+1][1])
        #print(j, "총 distance는 ", distance)
        skip = False
        arr[i][0] = temp[0]
        arr[i][1] = temp[1]
    
    min_dist = min(min_dist, distance)
    print()
    print("현재 min는 ", min_dist)


print(min_dist)
"""