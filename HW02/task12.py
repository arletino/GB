'''Задача 12: Петя и Катя – брат и сестра. Петя – студент, а Катя – школьница. Петя помогает Кате по математике.
 Он задумывает два натуральных числа X и Y (X,Y≤1000), а Катя должна их отгадать. 
 Для этого Петя делает две подсказки. Он называет сумму этих чисел S и их произведение P. 
 Помогите Кате отгадать задуманные Петей числа.'''

sum_num = int(input('Введите сумму чисел: '))
pow_num = int(input('Введите произведение чисел '))
print('Ответ в первом варианте решения')
if (disc:= sum_num ** 2 - 4 * pow_num) < 0 or (disc ** 0.5) % int(disc ** 0.5) != 0:
    print('Таких чисел нет')
elif disc  == 0:
    num_first = int(sum_num / (2 * pow_num))
    num_second = int(sum_num - num_first)
    print(f'Первое число: {num_first}')
    print(f'Воторое число: {num_second}')
else:
    num_first = int((sum_num + disc ** 0.5) / 2 )
    num_second = int(sum_num - num_first)
    print(f'Числа {num_first} и {num_second}')

# Второй способ через циклы и перебор
num_f = 0
num_s= 0
for i in range(1, sum_num): # так как мы ищем целые положительные то число не может быть больше суммы -1
    for j in range(1, sum_num - i+1):
        if i + j == sum_num and i * j == pow_num:
            num_f = i
            num_s = j
print('Ответ во втором варианте решения')
print(f'Числа {num_f} и {num_s}' if num_f != 0 else 'Таких чисел нет')