a = int(input())

for i in range(1,a):
    a = a//i
    if(a==0):
        print(i)
        break