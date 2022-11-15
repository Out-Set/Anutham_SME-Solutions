# when one is true another is false, it should evaluates to True
var1 = True;
var2 = False;
result1 = ((var1==False) or (var2==False));
print(result1);


# when both are true, it should evaluates to False
var3 = True;
var4 = True;
result2 = ((var3==False) or (var4==False));
print(result2);


# when both are false, it should evaluates to True
var5 = False;
var6 = False;
result3 = ((var5==False) or (var6==False));
print(result3);

