a,b = input().split()
a =int(a)
b = int(b)

for i in range(a, b+1):
    if(1920%i==0 and 2880%i==0):
        print(1)
        break
    else:
        print(0)