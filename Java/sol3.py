str = input("Enter a sentence: ")

newStr = "";  
   
for i in range(0, len(str)):  
    #Checks for lower case character  
    if str[i].islower():  
        #Convert lower case character upper case using upper() function  
        newStr += str[i].upper(); 

    #Checks for upper case character  
    elif str[i].isupper():  
        #Convert upper case lower case using lower() function  
        newStr += str[i].lower();  
      
    else:  
        newStr += str[i];   


print("Running output : " +  newStr);  


