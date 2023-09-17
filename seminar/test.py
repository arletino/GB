# def compress(chars: list[str]) -> int:
#     s = ''
#     letter = ''
#     count = 1
#     for ch in chars:
#         if ch in s:
#             count +=1
#         elif count !=1:
#             s += str(count) + ch
#             count = 1
#         else:
#             s += ch
#     return s if count == 1 else s + str(count)

# chars = ["a","a","b","b","c","c","c"]
# print(compress(chars))))

n = 100000000000000
count = 0
for i in range(1, int(n ** 0.5) + 1):
    if i ** 3 <= n:  
        count +=1
    if i ** 2 <= n:
        count +=1
    if i ** 6 <= n:
        count -=1
print(count) 
