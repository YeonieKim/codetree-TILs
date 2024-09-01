n, k = map(int, input().split())
arr = list(map(int, input().split()))

max_sum = 0

for i in range(n-k+1):
    sum_num = 0
    for j in range(i, i+k):
        sum_num += arr[j]
    max_sum = max(max_sum, sum_num)

print(max_sum)