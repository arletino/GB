'''Задача 38: Дополнить телефонный справочник возможностью изменения и удаления данных. 
Пользователь также может ввести имя или фамилию, 
и Вы должны реализовать функционал для изменения и удаления данных'''
def show_menu():
     print('1. Распечатать справочник'
           '2. Найти телефон по фамилии'
           '3. Изменить номер телефона'
           '4. Удалить запись'
           '5. Найти абонента по номеру телефона'
           '6. Добавить абонента в справочник'
           '7.Удаление номер телефона'
           '8. Закончить работу', sep = '\n')
     choice=int(input())
     return choice

def read_txt(name_file):
    with open(name_file, 'rt', encoding='utf-8') as file:   
        return file.readlines()
    
def print_result(phone_book):
    for line in phone_book:
        print(line)
        
def write_txt(name_file, text):
    with open(name_file, 'w', encoding='utf-8' ) as file:
        return file.writelines(text)
    
def find_by_lastname(phone_book,last_name):
    for i in phone_book:
        if last_name in i:
            return i

def change_number(phone_book,last_name,new_number):
    for i, person in enumerate(phone_book):
        if last_name == person.split()[2]:
            phone_book[i].replace(person.split()[1], new_number) 
            return phone_book

def delete_by_lastname(phone_book,lastname):

def find_by_number(phone_book,number):

         
def work_with_phonebook():
    choice=show_menu()
    phone_book=read_txt('phonebook.txt')
    while (choice!=8):
        if choice==1:                                       # 1. Распечатать справочник
            print_result(phone_book)
        elif choice==2:                                     # 2. Найти телефон по фамилии
            last_name=input('lastname ')
            print(find_by_lastname(phone_book,last_name))
        elif choice==3:                                     # 3. Изменить номер телефона
            last_name=input('lastname ')
            new_number=input('new  number ')
            print(change_number(phone_book,last_name,new_number))
        elif choice==4:                                     # 4. Удалить запись по фамилии 
            lastname=input('lastname ')
            print(delete_by_lastname(phone_book,lastname))
        elif choice==5:                                     # 5. Найти абонента по номеру телефона
            number=input('number ')
            print(find_by_number(phone_book,number))
        elif choice==6:                                     # 6. Добавить абонента в справочник
            user_data=input('new data ')
            add_user(phone_book,user_data)
            write_txt('phonebook.txt',phone_book)
        elif choice==7:                                      # 7.Удаление номер телефона
            user_data=input('lastname')
            del_user(phone_book,user_data)
            write_txt('phonebook.txt',phone_book)
    else: print('Goodbay')                               # 8. Закончить работу
