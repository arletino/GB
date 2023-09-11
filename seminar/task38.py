'''Создать телефонный справочник с
возможностью импорта и экспорта данных в
формате .txt. Фамилия, имя, отчество, номер
телефона - данные, которые должны находиться
в файле.
1. Программа должна выводить данные
2. Программа должна сохранять данные в
текстовом файле
3. Пользователь может ввести одну из
характеристик для поиска определенной
записи(Например имя или фамилию
человека)
4. Использование функций. Ваша программа
не должна быть линейной'''

from os.path import exists
from csv import DictReader, DictWriter

def get_info():
    info = []
    first_name = 'Ivan'
    last_name = 'Ivanov'
    info.append(first_name)
    info.append(last_name)
    flag = False
    while not flag:
        try:
            phone_number = 12345678901 #int(input('Введите номер телефона: '))
            if len(str(phone_number)) != 11:
                print('wrong number')
            else:
                flag = True
        except ValueError:
            print('not valid number')
    info.append(phone_number)
    return info

def create_file():
    with open('phone.csv', 'w', encoding='utf-8') as data:
        # data.write('Фамилия;Имя;Номер\n')
        f_n_writer = DictWriter(data, fieldnames=['Фамилия', 'Имя', 'Номер'])
        f_n_writer.writeheader()

def write_file(lst):
    # with open('phone.txt', 'a', encoding='utf-8') as data:
    #     data.write(f'{lst[0]};{lst[1]};{lst[2]}\n')
    with open('phone.csv', 'r+') as f_n:
        f_n_reader = DictReader(f_n)
        res = list(f_n_reader)
        obj = {'Фамилия': lst[0], 'Имя': lst[1], 'Номер': lst[2]}
        res.append(obj)
        f_n_writer = DictWriter(f_n, fieldnames=['Фамилия', 'Имя', 'Номер'])
        for el in res:
            f_n_writer.writerow(el)

def read_file(file_name):
    # with open(file_name, encoding='utf-8') as data:
    #     phone_book = data.readlines()
    with open(file_name) as f_n:
        f_n_reader = DictReader(f_n)
        phone_book = f_n_reader
    return phone_book
    
def record_info():
    lst = get_info()
    write_file(lst)


def main():
    while True:
        command = input('Введите команду: ')
        if command == 'q':
            break
        elif command == 'r':
            if not exists('phone.csv'):
                print('Файл не создан')
                break
            print(*read_file('phone.csv'))
        elif command == 'w':
            if not exists('phone.csv'):
                create_file()
                record_info()
            else:
                record_info()

main()


































'''Задача 38: Дополнить телефонный справочник возможностью изменения и удаления данных. 
Пользователь также может ввести имя или фамилию, 
и Вы должны реализовать функционал для изменения и удаления данных'''
# def show_menu():
#      print('1. Распечатать справочник',
#            '2. Найти телефон по фамилии',
#            '3. Изменить номер телефона',
#            '4. Удалить запись',
#            '5. Найти абонента по номеру телефона',
#            '6. Добавить абонента в справочник',
#            '7. Закончить работу', sep = '\n')
#      choice=int(input())
#      return choice

# def read_txt(name_file):
#     with open(name_file, 'rt', encoding='utf-8') as file:   
#         data = file.readlines()
#     return data
    
# def print_result(phone_book):
#     for line in phone_book:
#         print(line)
        
# def write_txt(name_file, text = ''):
#     with open(name_file, 'w', encoding='utf-8' ) as file:
#         return file.writelines(text)
    
# def find_by_lastname(phone_book,last_name):
#     for i in phone_book:
#         if last_name in i:
#             return i

# def change_number(phone_book,last_name,new_number):
#     for i, person in enumerate(phone_book):
#         if last_name in person:
#             phone_book[i] = phone_book[i].replace(person.split()[0], new_number) 
#             return phone_book

# def delete_by_lastname(phone_book,lastname):
#     for i, person in enumerate(phone_book):
#         if lastname in person:
#             del phone_book[i] 
#             return phone_book

# def find_by_number(phone_book,number):
#     for i in phone_book:
#         if number in i:
#             return i
#     else:
#         return 'now such telephone number in book'

# def add_user(phone_book,user_data):
#     return phone_book.append(user_data + '\n')

         
# def work_with_phonebook():
#     print("\033c", end="")
#     try:
#         phone_book=read_txt('phonebook.txt')
#     except FileNotFoundError:
#         write_txt('phonebook.txt')
#         print('Справочника не было, теперь создан файл "phonebook.txt"')
#     else:
#         phone_book=read_txt('phonebook.txt')

#     while ((choice:=show_menu())!=7):
#         print("\033c", end="")

#         if choice==1:                                       # 1. Распечатать справочник
#             print_result(phone_book)
#             input('для перехода в основное меню нажмите Enter')
#         elif choice==2:                                     # 2. Найти телефон по фамилии
#             last_name=input('lastname ')
#             print(find_by_lastname(phone_book,last_name))
#             input('для перехода в основное меню нажмите Enter')
#         elif choice==3:                                     # 3. Изменить номер телефона
#             last_name=input('lastname ')
#             new_number=input('new  number ')
#             phone_book = change_number(phone_book,last_name,new_number)
#             print_result(phone_book)
#             input('для перехода в основное меню нажмите Enter')
#         elif choice==4:                                     # 4. Удалить запись по фамилии 
#             lastname=input('lastname ')
#             phone_book = delete_by_lastname(phone_book,lastname)
#             print(phone_book)
#             input('для перехода в основное меню нажмите Enter')
#         elif choice==5:                                     # 5. Найти абонента по номеру телефона
#             number=input('number ')
#             print(find_by_number(phone_book,number))
#             input('для перехода в основное меню нажмите Enter')
#         elif choice==6:                                     # 6. Добавить абонента в справочник
#             user_data=input('new data ')
#             add_user(phone_book,user_data)
#             input('для перехода в основное меню нажмите Enter')

#     else: 
#         write_txt('phonebook.txt',phone_book)
#         print('телефонная книга сохранена Goodbay')                               # 7. Закончить работу

# work_with_phonebook()