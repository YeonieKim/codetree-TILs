n = int(input())

people_num = list(map(int, input().split()))

for i in range(n):
    sum_distance = 0
    min_distance = 100

    for j in range(n):
        sum_distance += abs(people_num[j]-people_num[i])

    min_distance = min(min_distance, sum_distance)
    
print(min_distance)