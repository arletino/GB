'''Задача №31. Решение в группах
Последовательностью Фибоначчи называется
последовательность чисел a0
, a1
, ..., an
, ..., где
a0 = 0, a1 = 1, ak = ak-1 + ak-2 (k > 1).
Требуется найти N-е число Фибоначчи 0 1 1 2 3 5 8 13 21
Input: 7
Output: 21'''

def fibonachi(n):
    if n in [0, 1]:
        return n 
    else:  
        print(n)
        return fibonachi(n-1) + fibonachi(n - 2)

fibonachi(7)

