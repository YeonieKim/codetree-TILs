n, k = map(int, input().split())
arr = [
    input().split()
    for _ in range (n)
]

list1 = []
list2 = []
max_size = 0
for i in range(n):
    num_list = int(arr[i][0])
    str_list = str(arr[i][1])
    list1.append(num_list)
    list2.append(str_list)
#print(list1)
#print(list2)
for elem in list1:
    max_size = max(max_size, elem)

#print(max_size)
placed = [0] * (max_size)
for i in range(n):
    if(list2[i] == "G"):
        num = list1[i]
        placed[num-1] = 1
    else: 
        num = list1[i]
        placed[num-1] = 2
#print(placed)

max_score = 0
for i in range(0, max_size-n):
    sum_score = 0
    for j in range(i, i + k+1):
        sum_score += placed[j]
        #print(sum_score)
    max_score = max(max_score, sum_score)
    #print(max_score)
    #print()

print(max_score)