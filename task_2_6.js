/* 6. Реализовать функцию с тремя параметрами: function mathOperation(arg1, arg2, operation), 
где arg1, arg2 – значения аргументов, operation – строка с названием операции. 
В зависимости от переданного значения операции выполнить одну из арифметических операций (использовать функции из пункта 3) 
и вернуть полученное значение (использовать switch).
*/
function addition(x, y){
	return x + y;
} 
function substraction(x, y){
	return x - y;
}
function multiplication(x, y){
	return x * y;
}
function deviation(x, y){
	return x / y;
}
function mathOperation(x, y, operation){
	switch(operation){
		case '+':
			return addition(x,y);
			break;
		case '-':
			return substraction(x,y);
			break;
		case '*':
			return multiplication(x,y);
			break;
		case '/':	
			return deviation(x,y);
			break;
	}
}

var x = +prompt('Введите первое число');
var y = +prompt('Введите второе число');
var operation = prompt('Введите опрецию ("+", "-", "*","/")');
alert(`Результат ${mathOperation(x, y, operation)}`);