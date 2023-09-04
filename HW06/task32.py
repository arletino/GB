'''Задача 32: Определить индексы элементов массива (списка), 
значения которых принадлежат заданному диапазону 
(т.е. не меньше заданного минимума и не больше заданного максимума)'''

from random import randint


def list_index(lst: list, left_border : int, right_border : int) -> list:
    return [i for i, el in enumerate(lst) if left_border <= el <= right_border]

lst = [randint(-10, 10) for _ in range(20)] #Задаем список из 20 элементов случайным образом
print(lst)      # Output generated  list     
left_border = int(input('Input left border: ')) # Input left border
right_border = int(input('Input right border: ')) # Input right border

print(list_index(lst, left_border, right_border)) # Output list of index elements between left and right borders
