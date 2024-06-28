sum_age = 0

for i in range(1, 100):
    n = int(input())

    if(n<30 and n>=20):
        sum_age += n
        avg = sum_age/i
    else:
        print(f"{avg:.2f}")
        break