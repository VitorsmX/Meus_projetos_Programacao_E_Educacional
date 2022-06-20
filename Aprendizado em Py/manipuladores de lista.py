num = [1,4,3,6]
num[1] = 8
num.append(7)
num.sort(reverse = True)
num.insert(1, 9)
num.pop(1)
if 3 in num:
    num.remove(3)
    print('removido o numero 3')
else:
    print('não achei o numero 3')
print(num)
print('Essa lista tem ' + str(len(num)) + ' elementos')