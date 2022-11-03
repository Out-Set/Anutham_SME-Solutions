from curses.ascii import isdigit

num1 = input("Enter first number: ")
num2 = input("Enter second number: ")

# checking if both the numbers are not numeric
if(num1.isdigit() != True and num2.isdigit() != True):
    print("Both numbers need to be numeric values.")

# checking if the first number is not numeric
elif(num1.isdigit() != True):
    print("First numbers need to be numeric values.")

# checking if the second number is not numeric
elif(num2.isdigit() != True):
    print("Second numbers need to be numeric values.")

# if no one is other than numeric(i.e. when both are integer)
else:
    num1 = int(num1)
    num2 = int(num2)
    print("The sum is: ",num1*num2)

