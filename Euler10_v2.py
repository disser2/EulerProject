import math

up = 2000000
myList=[i for i in range(up)]
for x in range(2,int(math.sqrt(up))):
    if myList[x] != 0:
        y = x*2
        while y < up:
            myList[y] = 0
            y +=x
            
sum = 0

for x in myList:
    sum += x
    
print(sum)
    