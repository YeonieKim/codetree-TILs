n = int(input())

arr = list(map(int,input().split()))

max_num1 = 0
max_num2 = 0

idx = 100

for i in range(2):
    for j in range(n):
        if(max_num1 < arr[j]):
            max_num1 = arr[j]
            idx = j
            #print("1은 ", max_num1)

        if( j != idx and j != idx-1 and j != idx+1 and max_num2 < arr[j]):
            max_num2 = arr[j]
            #print("2는 " , max_num2)
    
    #print()



print(max_num1+max_num2)