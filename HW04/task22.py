'''Задача 22: Даны два неупорядоченных набора целых чисел (может быть, с повторениями). 
Выдать без повторений в порядке возрастания все те числа, которые встречаются в обоих наборах.
Пользователь вводит 2 числа. n — кол-во элементов первого множества. 
m — кол-во элементов второго множества. Затем пользователь вводит сами элементы множеств.'''

from random import randint

def manual_fill_list(): # функция для задания размера и заполнения списка пользователем
    return [int(input(f'введите {i}-й - элемент: ')) for i in range(int(input('введите колв-элементов: ')))]

def random_fill_list(): # функция для задания размера и заполнения списка случайным образом
    return [randint(1, 5) for i in range(int(input('введите колв-элементов: ')))]

if input('1 - Заполнить элементы случайным способом\n' # Выбираем каким способом заполнить списки
         '2 - Заполнить элементы ручным способом\n'
         'Введите номер пункта: ') == '1':
    lst1 = random_fill_list()
    lst2 = random_fill_list()
else:
    lst1 = manual_fill_list()
    lst2 = manual_fill_list()
print(lst1)
print(lst2)
lst_res =[]
for i in (lst1 if len(lst1) >= len(lst2) else lst2):
    print(i)
    if i in lst1 and i in lst2 and i not in lst_res:
        lst_res.append(i)
print(sorted(lst_res)) 

