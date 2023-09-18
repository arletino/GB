import tkinter as tk
from tkinter import filedialog as fd


def insert_text():
    file_name = fd.askopenfilename(
        filetypes=(("TXT files", "*.txt"),
                   ("CSV files", "*.csv"),
                   ("All files", "*.*")))
    f = open(file_name)
    s = f.read()
    tk.text.insert(1.0, s)
    f.close()

def str_to_sort_list(event):
    s = ent1.get()
    s = s.split()
    s.sort()
    lab['text'] = ' '.join(s)

root =tk.Tk()
mainmenu = tk.Menu(root)
root.config(menu=mainmenu)
filemenu = tk.Menu(mainmenu, tearoff=0)
filemenu.add_command(label='Новый')
filemenu.add_command(label='Открыть', command=insert_text)
filemenu.add_command(label='Сохранить')
filemenu.add_separator()
filemenu.add_command(label='Выход')
mainmenu.add_cascade(label='Файл', menu=filemenu)
w = root.winfo_screenwidth() // 4 
h = root.winfo_screenheight() // 2
root.geometry(f'400x400-{w}+{h}')

text = tk.IntVar()
ent1 = tk.Entry(root, width=20, textvariable=text)
some_text = text.get()
print(text)
but = tk.Button(root, text='Hello')
ent2 = tk.Entry(root, width=20)
ent2.insert(-1, some_text)
lab = tk.Label(root, width=20, bg='Red', fg='white')

but.bind('<Button-1>', str_to_sort_list)

ent1.pack()

but.pack()
lab.pack()
ent2.pack()

root.mainloop()