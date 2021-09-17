up = 20000
sum = 0
for x in range(1,up):
    prime = True
    for y in range(2,int(x/2)):
        if x - int((x/y)) * y == 0:
            prime = False
    if prime:
        sum += x
        
print(sum)