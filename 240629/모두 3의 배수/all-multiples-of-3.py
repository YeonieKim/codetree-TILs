a =[0, 0, 0 ,0 ,0]
multiple = True

for i in range(5):
    a[i] = int(input())

    if(a[i] % 3 != 0):
        multiple = False
        break

    

if(multiple):
    print(1)
else:
    print(0)