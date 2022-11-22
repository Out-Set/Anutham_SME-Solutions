def great_42(a, b):     
    # if either a's or b's value is 42 then return True     
    if a == 42 or b == 42:         
        return True     
    # if sum of a and b both values is 42 then return True     
    elif a + b == 42:         
        return True     
    # if absolute difference of a and b is 42 then return True     
    elif abs(a - b) == 42:         
        return True    
    # it is not mentioned to return False in any case
 
print(great_42(42, 2))

print(great_42(20, 18))

print(great_42(34, 89))
 
print(great_42(78, 56))

