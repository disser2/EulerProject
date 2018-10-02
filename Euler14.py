## This Euler-Problem asks for the number up to a certain limit, which has the longest Collatz-Chain
# Go 1 Step in the Collatz-Sequence
def cstep(n):
    if n % 2 == 0:
        return n/2
    else:
        return 3*n+1

# Calculate the Number of Steps for a certain number
def numberOfSteps(n):
    start = n
    i = 1

    while True:
        #print(start)
        start = cstep(start)
        i += 1
        if (start == 8):
            return i+3

# Start parameters
max = 0
winner = 0

# Check all numbers up to a certain bound
for i in range(16,1000000):
    #print("Berechne Anzahl Schritte fuer ",i)
    number = numberOfSteps(i)

    if number > max:
        max = number
        winner = i
        print("Neuer Spitzenreiter: ",winner," mit ", max, " Schritten")

# Print out the winner
print("Gewonnen hat ",winner," mit ",max," Schritten")