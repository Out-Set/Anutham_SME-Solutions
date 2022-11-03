import math

n = int(input("Enter a possitive integer value: "))

print("The hailstorms are: ")

while n != 1:
    if n%2 == 0:
        n = n/2

    else:
        n = 3*n + 1
    
    #trunc() function removes the decimal places
    print(math.trunc(n))

