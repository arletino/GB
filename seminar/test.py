def test(nums: list[int]) -> list:
    lst = []
    pow = 1
    for el in nums:
        lst.append(pow)
        pow *= el    
    pow = 1
    for i in range(len(nums) - 1, -1, -1):
        lst[i] = pow * lst[i]
        pow *= nums[i]
    return lst
    

lst = [1,2,3,4]
print(lst)
print(test(lst))