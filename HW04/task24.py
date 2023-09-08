from random import randint
count_bush = 10
list_bush = [randint(1, 10) for i in range(count_bush)]
sum_beries = []
for i in range(-1, count_bush-1):
  print('/',list_bush[i], '\\')
  print(list_bush[i-1],'-', list_bush[i+1], '=', count_beries:=sum([list_bush[i-1],list_bush[i], list_bush[i+1]]))
  sum_beries.append(count_beries)
print('Кол-во ягод: ',list_bush)
print('Суммы ягод: ', sum_beries)
print('Максимальная сумма ягод:',max(sum_beries))
