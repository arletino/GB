'''Задача №23. Решение в группах
Дан массив, состоящий из целых чисел. Напишите
программу, которая подсчитает количество
элементов массива, больших предыдущего (элемента
с предыдущим номером)
Input: [0, -1, 5, 2, 3]
Output: 2 (-1 < 5, 2 < 3)
Примечание: Пользователь может вводить значения
списка или список задан изначально.
lst = [0, -1, 5, 2, 3]
set_1 = set()
for el in lst:
    for val in el.values():
        set_1.add(val)
print(set_1)

set_1 = set(val for el in lst for val in el.values())
print(set_1)

count = 0 
for el, i in enumerate(lst):
    if el in lst[:i] and el in lst[i:]:
        count +=1
        lst.remove(el)
print(count)'''
import bisect
li1 = [3, 1, 4, 4, 4, 6, 7]
print (li1[bisect.bisect_left(li1, 2)])