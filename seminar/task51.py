'''Напишите функцию same_by(characteristic, objects), которая
проверяет, все ли объекты имеют одинаковое значение
некоторой характеристики, и возвращают True, если это так.
Если значение характеристики для разных объектов
отличается - то False. Для пустого набора объектов, функция
должна возвращать True. Аргумент characteristic - это
функция, которая принимает объект и вычисляет его
характеристику.
Ввод:                                   Вывод:
values = [0, 2, 10, 6]                      same
if same_by(lambda x: x % 2, values):
print(‘same’)
else:
print(‘different’)'''

# def same_by(characteristic, values):
#     if len(values) == 0:
#         return True
#     for _ in map(characteristic, values):
#         if _ :
#             return False
#     return True

def same_by(characteristic, objects):
    return len(set(map(characteristic, objects))) < 2
    
    
values = []
if same_by(lambda x: x % 2, values):
    print('same')
else:
    print('different')
