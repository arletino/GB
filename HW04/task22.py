'''Задача 22: Даны два неупорядоченных набора целых чисел (может быть, с повторениями). 
Выдать без повторений в порядке возрастания все те числа, которые встречаются в обоих наборах.
Пользователь вводит 2 числа. n — кол-во элементов первого множества. 
m — кол-во элементов второго множества. Затем пользователь вводит сами элементы множеств.'''

from random import randint

m = 6
n =6
lst1 = [randint(1, 10) for i in range(m)]
lst1.sort()
lst2 = [randint(1, 10) for i in range(n)]
lst2.sort()
lst_res = []
i, j = 0, 0
while i < len(lst1) and j < len(lst2):
    if lst1[i] < lst2[j]:
        if lst1[i] not in lst_res:lst_res.append(lst1[i])
        i += 1
    else:
        if lst2[j] not in lst_res:lst_res.append(lst2[j])
        j +=1
if i != len(lst1) - 1:
    lst_res.extend(lst1[i:])
else:
    lst_res.extend(lst2[j:])
print(lst1)
print(lst2)
print(lst_res)
проверка new1
