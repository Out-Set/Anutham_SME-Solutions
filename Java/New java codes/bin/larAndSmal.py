firstNumber = "none"
secondNumber = "none"
thirdNumber = "none"

firstNumber = input("Enter a number please? ")
secondNumber = input("Enter a number please? ")
thirdNumber = input("Enter a number please? ")

if firstNumber > secondNumber:
    if firstNumber > thirdNumber:
        largest =firstNumber

    elif secondNumber > thirdNumber:
        largest = secondNumber

else:
    largest = thirdNumber

if firstNumber < secondNumber:
    if firstNumber < thirdNumber:
        smallest = firstNumber

    elif secondNumber < thirdNumber:
        smallest = secondNumber

else:
    smallest = thirdNumber

print("The largest value is " + str(largest))
print("The smallest value is " + str(largest))
