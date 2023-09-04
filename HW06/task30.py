'''Заполните массив элементами арифметической прогрессии. 
Её первый элемент, разность и количество элементов нужно ввести с клавиатуры. 
Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.'''


def list_arif_progress(num_first: int, diff: int, amount: int) -> list:   # Первый классический способ
    return [num_first + (n - 1) * diff for n in range(1, amount+1)]


num_first = int(input('Введите первый элемент: '))
diff = int(input('Введите разницу: '))
amount = int(input('Введите кол-во элементов: '))

print(list_arif_progress(num_first, diff, amount))

# Второй способ с использованием range для генерации арифметической последовательности
print(list(range(num_first, num_first + (amount) * diff, diff)))
