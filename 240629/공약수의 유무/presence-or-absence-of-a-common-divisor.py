a,b = input().split()
a =int(a)
b = int(b)
GCN = False

for i in range(a, b+1):
    if(1920%i==0 and 2880%i==0):
        GCN = True
        break

if(GCN):
    print(1)
else:
    print(0)