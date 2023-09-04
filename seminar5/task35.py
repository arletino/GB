'''
# Напишите функцию, которая принимает одно число и
# проверяет, является ли оно простым
# Напоминание: Простое число - это число, которое
# имеет 2 делителя: 1 и n(само число)
# Input: 5
# Output: yes'''

'''def prime_num(n): 
    if n == 1:
        return True
    elif temp % (n - 1) == 0 and  n != 1: 
        return False
    else: 
        return  prime_num(n-1)'''


n = 4

def is_prime(some_num):
    if some_num > 2:
        for i in range(2, int(some_num**0.5) + 1):
            if some_num % i == 0:
                return False
        return True
    else: return True


print(is_prime(n))

'''
def prime_num(n, checker=True, i=2):
    if i == n // 2 + 1:
        if n % i == 0:
            return = False
        else:
            prime_num(n, checker, i+1)       
#   else:
#        return checker   
    return prime_num(n, checker, i+1)

print(prime_num(n)) '''