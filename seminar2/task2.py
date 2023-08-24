def shift_sequence(arr, k):
    length = len(arr)
    k = k % length
    result = arr[length-k:] + arr[:length-k]
    return result

arr = [1, 2, 3, 4, 5, 6]
k = int(input("Введите шаг: "))
print(arr)
print(shift_sequence(arr, k))

lst = [1, 2, 3, 4, 5, 6]
k = 3
for i in range(k):
    el = lst.pop()
    lst.insert(0, el)
print(lst)

