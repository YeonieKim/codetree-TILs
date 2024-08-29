R, C = map(int, input().split())

square = [
    list(map(str, input().split()))
    for _ in range(R)
]

cnt = 0
for i in range(1, R-1):
    for j in range(1, C-1):
        for k in range(i+1,R-1):
            for l in range(j+1,C-1):
                if(square[0][0] != square[i][j] and square[i][j] != square[k][l]):
                    cnt += 1
                    #print(square[0][0])
                    #print(i, j, square[i][j])
                    #print(k, l, square[k][l])
                    #print(cnt)

print(cnt)