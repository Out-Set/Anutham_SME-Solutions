# Taking 5 inputs from user
a = int(input("Enter the first value : "))
b = int(input("Enter the second value : "))
c = int(input("Enter the third value : "))
d = int(input("Enter the forth value : "))
e = int(input("Enter the fifth value : "))

# calculate the score
s = a*b*c*d*e;

# through if else statement
if s>0 : 
    print("POSITIVE");
elif s== 0 : 
    print("ZERO");
elif s <0 : 
    print("NEGATIVE");
else : 
    print("EMPTY")

