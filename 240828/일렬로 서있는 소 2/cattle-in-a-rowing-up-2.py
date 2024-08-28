num_cow = int(input())
cow_height = list(map(int, input().split()))

pair_num = 0

for i in range(num_cow):
    for j in range(i+1, num_cow):
        for k in range(j+1, num_cow):
            if(cow_height[i]<= cow_height[j] and cow_height[j] <= cow_height[k]):
                pair_num += 1
                

print(pair_num)