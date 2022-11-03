def word_intersection():

    #input the string and convert to set
    set1=set(input("Enter the first word: ")); 

    #input the string and convert to set 
    set2=set(input("Enter the second word: ")); 
    
    print("The letters the two words have in common are: ",end="");
    
    #for each element in intersection set
    for n in set1.intersection(set2):

        #print the element
        print(n, end=" ");

#call the function
word_intersection();

