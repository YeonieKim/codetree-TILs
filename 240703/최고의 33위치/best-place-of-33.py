n = int(input())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]
max_num = 0

def goldnum(r_s, c_s):
    num_of_gold = 0
    for i in range(r_s, r_s+3):
        for j in range(c_s, c_s+3):
            num_of_gold += grid[i][j]

    return num_of_gold

for i in range(n):
    for j in range(n):
        if(i+2>=n or j+2 >=n):
            continue

        num_of_gold = goldnum(i, j)
        max_num =max(max_num,num_of_gold)

print(max_num)