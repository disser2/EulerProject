## This Euler-Problem asks for the first triangle number with more than 500 divsisors

import math

# Listing the triangle numbers
sum = 0

# Counts the number of divisors of a number
def div(n):
    count = 0
    #print("Calculate divisors of",n)
    for j in range(1,int(math.sqrt(n))+1):
        #print("Testing", j)
        #print("n%j=",n%j)
        if n % j == 0:
            count += 1
    return(2*count)

#n = int(input("Berechne Anzahl der Teiler von; "))
#print(n," hat so viele Teiler: ",div(n))

u = 500

for i in range(1,20000):
    sum += i
    if div(sum) >= 500:
        print(sum, "hat mehr als 500 Teiler!")