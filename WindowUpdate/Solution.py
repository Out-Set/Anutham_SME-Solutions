# Creating two while loops, outer loop iterates until user enters 'stop'
while True:
    # Taking input from user
    num = int(input("Enter a number: "))
    # set the number as min and max
    min = num
    max = num
    # inner loop iterates until user enters 0
    while True:
        num = int(input("Enter a number: "))
        if num == 0:
            break
        # find smallest number
        if num<min:
            min = num
        # find largest number
        if num>max:
            max = num
    # print the largest and smallest numbers
    print(f'Max number is: {max}')
    print(f'Max number is: {min}\n')
    # taking input to continue or stop
    handler = input("Want to continue?(continue/exit): ")
    if handler == "exit":
        break

    