import sys

INT_MAX = sys.maxsize

n = int(input())
people_num = list(map(int, input().split()))
min_distance = INT_MAX

for i in range(n):
    sum_distance = 0

    for j in range(n):
        sum_distance += people_num[j] * abs(j-i)
    
    min_distance = min(min_distance, sum_distance)
    
print(min_distance)