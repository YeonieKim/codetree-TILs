import sys

INT_MAX = sys.maxsize

n = int(input())
arr = [
    list(map(int, input().split()))
    for _ in range(n)
]

distance = 0
skip = False

min_dist = INT_MAX
for i in range(1,n-1):
    for j in range(n-1):
        if not skip:
            arr[i][0] = arr[i-1][0]
            arr[i][1] = arr [i-1][1]

        #계산
        distance += abs(arr[j][0]-arr[j+1][0]) + abs(arr[j][1]-arr[j+1][1])
        skip = False
    
    min_dist = min(min_dist, distance)


print(min_dist)