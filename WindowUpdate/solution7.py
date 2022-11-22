# Initialization of coordinates
# Please type the input separated by a comma. i.e. 0,2 or 5,6 etc.
x, y = map(int, list(input("Insert the value for coordinates X and Y : ").split(",")))

# find true condition of first quadrant
if x > 0 and y > 0:
    print("point (", x, ",", y, ") lies in the First quadrant")

# Second quadrant
elif x < 0 and y > 0:
    print("point (", x, ",", y, ") lies in the Second quadrant")

# Third quadrant
elif x < 0 and y < 0: 
    print("point (", x, ",", y, ") lies in the Third quadrant")

# Fourth quadrant 
elif x > 0 and y < 0:
    print("point (", x, ",", y, ") lies in the Fourth quadrant")

# To find does not lie on origin
elif x == 0 and y == 0:
    print("point (", x, ",", y, ") lies at the origin")

# Coordinates on x-axis
elif y == 0 and x != 0:
    print("point (", x, ",", y, ") on x-axis")

# Coordinates on y-axis
elif x == 0 and y != 0:
    print("point (", x, ",", y, ") on y-axis")

