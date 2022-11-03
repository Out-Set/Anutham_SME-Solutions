def main():
    # create data structure named 'data_structure' that stores info of 'batman' and 'superman' with their powers
    data_structure ={}
  
    # declare required variables of sh1 and sh2 and then add it's powers into ds
    sh1='batman'
    sh2='superman'
    data_structure[sh1]=['intelligence','technology','science']
    data_structure[sh2]=['flight','strength','vision']
  
    # print data in ds
    for key in data_structure.keys():
        print(key+":"+str(data_structure[key]))  

# call main method
main()

