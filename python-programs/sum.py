#importing sys package for using command line arguments
import sys

# len() method: find no of arguments passed in commandLine
n = len(sys.argv)  

#intializing sum to 0
sum = 0

#looping from 1 to count of command line arguments

for i in range(1, n):
    
    #intially command line arguments are type string
    #int() function to convert string types to integer
    #adding each number to sum
    sum = sum + int(sys.argv[i])

#printing sum
print("Sum : " , sum)

