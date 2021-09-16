a = 1
b = 1
c = 2

counter = 1

while len(str(a)) < 1000:
    a = b
    b = c
    c = a + b
    counter += 1

counter