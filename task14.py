# Требуется вывести все целые степени двойки (т.е. числа вида 2k), не превосходящие числа N.

number = int(input("Введите N: "))
degree = 2

for i in range(1, number):
    multi = degree ** i
    if multi < number:
        print (i)
    