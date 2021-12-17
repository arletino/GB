/*5. Реализовать основные 4 арифметические операции в виде функций с двумя параметрами. 
Обязательно использовать оператор return.
*/
function addition(x,y){
	return x + y;
} 
function substraction(x,y){
	return x - y;
}
function multiplication(x,y){
	return x * y;
}
function deviation(x,y){
	return x / y;
}
var x = +prompt('Введите первое число');
var y = +prompt('Введите второе число');
alert(`Результат функции сложения --> ${addition(x,y)}`);
alert(`Результат функции вычитания --> ${substraction(x,y)}`);
alert(`Результат функции умножения --> ${multiplication(x,y)}`);
alert(`Результат функции деления --> ${deviation(x,y)}`);