def shifr_cesar(st):
    lower_char_en ='abcdefghijklmnopqrstuvwxyz'
    upper_char_en = lower_char_en.upper()
    res = ''
    shift = count_shift(st)
    for ch in st:
        if ch in lower_char_en:
            res += lower_char_en[(lower_char_en.index(ch) if lower_char_en.index(ch) < (26 - shift) else lower_char_en.index(ch) - 26) + shift]
        elif ch in upper_char_en:
            res += upper_char_en[(upper_char_en.index(ch) if upper_char_en.index(ch) < (26 - shift) else upper_char_en.index(ch) - 26) + shift]
        else:
            res += ch
    return res

def count_shift(st):
    count = [1 if ch.isalpha() else 0 for ch in st]
    return  sum(count)
st = 'Day, mice. "Year" is a mistake!'

lst = st.split()
result = ' '.join(list(map(shifr_cesar, lst)))

print(result)
