'''Задача №37. Общее обсуждение
5 минут
Дано натуральное число N и
последовательность из N элементов.
Требуется вывести эту последовательность в
обратном порядке.
Примечание. В программе запрещается
объявлять массивы и использовать циклы
(даже для ввода и вывода).
Input: 2 -> 3 4
Output: 4 3'''

def revers(n):
    a = input()
    if n != 1: 
        revers(n-1)
    print(a, end=' ')


n = 3
revers(n)  