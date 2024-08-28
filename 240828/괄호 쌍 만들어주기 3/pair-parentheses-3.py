str_list = input()
pair_cnt = 0

for i in range(len(str_list)):
    if(str_list[i] == "("):
        for j in range(i+1, len(str_list)):
            if(str_list[j] == ")"):
                pair_cnt += 1


print(pair_cnt)