x, y, z = (input("Enter 3 integer numbers: ")).split()
x, y, z = (int(x), int(y), int(z))

if(x>0 and y>0 and z>0):
    total = x*0.5 + y*0.5 +z*0.5
    average = total/3
    print("total = %.2f  average = %.2f" %(total, average))
else:
    print("Numbers are not positive")



