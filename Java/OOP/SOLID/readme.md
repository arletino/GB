Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.

Формат сдачи: ссылка на гитхаб проект
SOLID :
1) SRP - Использование  Student и Teacher, StudentView, DataService, Controller как отдельных классов, каждый из которых отвечает за определенную задачу
2) OPC - У нас все классы открыты к расширению но закрыты для изменения - например когда мы наследуемся от абстрактного класса USER расширяя его функционал
3) LSP ко всем потомкам класса USER могут быть применены все методы и функционал полностью сохраняется.
4) ISP - данный принцип не используется в коде.
5) DIP - Для использование данного принципа были добавлены интерфейсы ListService, StudentService, TeacherService и DataService наследуется от этих интерфейсов. В данном случае построили зависимость от абстракций