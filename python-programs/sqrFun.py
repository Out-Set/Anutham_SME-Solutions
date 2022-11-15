# Python build-in method to calculate square of a number.

# In order to calculate square of a number, we have to import pow() method from the math library.
# pow(base, exponent)
from math import pow

print("Build-in method: ")
n_squared = pow(3, 2)
print(n_squared)

n_squared = pow(-2, 2)
print(n_squared)

n_squared = pow(12, 2)
print(n_squared)



# user define method to calculate square of a number.
print("User defined method: ")
def sqr(num):
    return num*num

n_squared = sqr(3)
print(n_squared)

n_squared = sqr(-2)
print(n_squared)

n_squared = sqr(12)
print(n_squared)

