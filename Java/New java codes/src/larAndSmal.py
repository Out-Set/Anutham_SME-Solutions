firstNumber = "none"
secondNumber = "none"
thirdNumber = "none"

firstNumber = input("Enter a number please? ")
secondNumber = input("Enter a number please? ")
thirdNumber = input("Enter a number please? ")

# checking for largest
if firstNumber > secondNumber:
    if firstNumber > thirdNumber:
        largest = firstNumber
    else:
        largest = thirdNumber

else:
    if secondNumber > thirdNumber:
        largest = secondNumber
    else:
        largest = thirdNumber

# checking for smallest
if firstNumber < secondNumber:
    if firstNumber < thirdNumber:
        smallest =firstNumber
    else:
        smallest = thirdNumber
        
else:
    if secondNumber < thirdNumber:
        smallest = secondNumber
    else:
        smallest = thirdNumber

print("The largest value is " + str(largest))
print("The smallest value is " + str(smallest))
