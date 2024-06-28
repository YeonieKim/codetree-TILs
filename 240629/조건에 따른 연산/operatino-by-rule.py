n = int(input())

for i in range (1,100):
    if(n % 2 == 0):
        n = n*3+1
    else:
        n = n*2+2

    if(n>=1000):
        print(i)
        break