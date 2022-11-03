a = 8
b = 6

c = "hello"
d = "bye"

# solution 
res1 = ((a-b) > (4*a))
print("Is (a minus b) greater than (4 multiplied by a): ", res1)

# len() method is used to find the length of a string
res2 = (len(c)-len(d)) == (a/4)
print("Is (length of c - b) equal to (a divided by 4): ", res2)

# we can concatenate a string and a string variable: 'good'+d
res3 = c > ('good'+d)
print("Is c greater than ('good' plus d): ", res3)

res4 = (len(c) > len('good'+d))
print("Is length of c greater than length of('good' plus d): ", res4)

