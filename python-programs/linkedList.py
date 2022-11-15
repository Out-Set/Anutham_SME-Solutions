import sys
MAXSIZE = 10 #size of linked list
Data = ['']*MAXSIZE #size of linked list fixed at value of SIZE
FreeNodes = [True]*MAXSIZE #free nodes array to keep count of free nodes
Link = [-1]*MAXSIZE #keeps track of link of nodes

headPtr = 0 #headptr

def InsertNode(Data, Link, FreeNodes, newNode, headPtr):
   for i in range(len(FreeNodes)):
       if FreeNodes[i] == True:
           Data[i] = newNode
           Link[i-1] = i
           Link[i] = (i+1)%MAXSIZE
           headPtr = i
           FreeNodes[i] = False
           return 1

   if(i >= len(FreeNodes)):
       return -1     

def DeleteNode(Data, Link, FreeNodes, nodeToDelete, headPtr):
   for i in range(len(Data)):
       if(Data[i]==nodeToDelete):
           Data[i] = ''
           Link[i-1]=i+1
           Link[i]= i+1
           FreeNodes[i]= True
           return 1

   return -1

def SearchList(Data, Link, FreeNodes, findNode, headPtr):
   for i in range(len(Data)):
       if(Data[i]=='findNode'):
           return i
   return -1

def PrintLinkedList(Data, Link, headPtr):
   i = headPtr
   while i!=-1:
       if(Data!=''):
           print (Data[i],' ')
       i = Link[i]

def PrintContent(Data, Link, headPtr,FreeNodes):
   for i in range(len(Data)):
       if(Data!=''):
           print ('Data->',Data[i],' Link->',Link[i])

   print ("Value of FreeNodes array")   
   print (FreeNodes,' ')
   print ("Value of headPtr- ",headPtr)

while(1):

   print ()
   print ('Enter the letter below that corresponds to the desired singly-linked list operation:')
   print ('A. Insert a new item (i.e., string) into the ordered singly-linked list.')
   print ('B. Delete a specified item (i.e., string) from the ordered singly-linked list.')
   print ('C. Print all items (i.e., strings) in the ordered singly-linked list.')
   print ('D. Print the contents of the following:')
   print ('   - Data array')
   print ('   - Link array')
   print ('   - FreeNodes array')
   print ('   - Value of headPtr')
   print ('E. End program.\n')

   userChoice = str(input('Enter your choice: '))

   if userChoice=='a' or userChoice=='A':
       newNode = str(input('Enter the data: '))
       InsertNode(Data, Link, FreeNodes, newNode, headPtr)

   elif userChoice=='b' or userChoice=='B':
       nodeToDelete = str(input('Enter node to Delete: '))
       DeleteNode(Data, Link, FreeNodes, nodeToDelete, headPtr)

   elif userChoice=='C' or userChoice=='c':
       PrintLinkedList(Data, Link, headPtr)

   elif userChoice=='d' or userChoice=='D':
       PrintContent(Data, Link, headPtr,FreeNodes)

   elif userChoice=='E' or userChoice=='e':
       sys.exit()

   else:
       print ("Invalid userChoiceion! Please enter A, B, C, D or E: ")


