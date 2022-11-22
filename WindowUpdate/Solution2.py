while True:
    count = 0
    while True:
        num = int(input("Enter a number: "))
        if num == 0:
            break
       
        # count above 50
        if num>50:
            count = count + 1
    # print the Count of above 50
    print(f'Count of above 50 is: {count}')
    # taking input to continue or stop
    des = int(input("Enter '0' for exit, '1' for continue: "))
    if des == 0:
        break

    