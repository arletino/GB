'''Задача 14: Требуется вывести все целые степени двойки (т.е. числа вида 2k), 
не превосходящие числа N.'''
from math import log2


def pow_lim(pow_limit):
    if pow_limit == 1: 
        return print('0', end=' ')
    else:
        pow_lim(pow_limit // 2)
        print(int(log2(pow_limit)), end=' ')    


num_pow = 0
pow_limit = int(input('Введите число до которого считать степени двойки: '))
print('Степени двойки: ', end='')
while 2 ** num_pow <= pow_limit:
    print(num_pow, end=' ') 
    num_pow +=1
print()


print('А теперь рекурсия')
pow_lim(pow_limit)
