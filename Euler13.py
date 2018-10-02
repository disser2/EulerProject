## This Euler-Problem asks for the first 10 digits in the sum of 50 given (long) numbers

import string
sum = 0

file = open('numbers.csv',"r")

for line in file:
    sum += int(line)

print(sum)