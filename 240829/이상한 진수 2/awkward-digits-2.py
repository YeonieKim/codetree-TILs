import math

a = list(map(int,input()))
reverse = False

for i in range(len(a)):
    if(a[i] == 0):
        reverse = True

for i in range(len(a)):
    # 다 1일 경우
    if(reverse == False):
        a[len(a)-1] = 0
        #print(a)
    
    # 0이 하나라도 있는 경우
    elif (a[i] != 1 and reverse == True):
        a[i] = 1
        #print(a)
        break

answer = 0
for i in range(len(a)):
    if(a[i] == 1):
        answer += math.pow(2, len(a)-i-1)
    #print(a[i], len(a)-i-1, math.pow(2, len(a)-i-1), answer)

print(round(answer))