SMALL_BEADS = 10.20 
MEDIUM_BEADS = 8.52 
LARGE_BEADS = 7.98  

#asking the user for the number of boxes 
small = int(input('Enter the number of boxes of small beads : ')) 
medium = int(input('Enter the number of boxes of medium beads : ')) 
large = int(input('Enter the number of boxes of large beads : '))  

#calculations 
smallTotal = small * SMALL_BEADS 
mediumTotal = medium * MEDIUM_BEADS 
largeTotal = large * LARGE_BEADS 
total = smallTotal + mediumTotal + largeTotal  

# using '\t'(tab-space), invoice can be formatted accordingly.
print("\n") # changing the line, for good output
print("SIZE\tQTY\t COST PER BOX\tTOTALS")   
print(f"Small\t {small}\t\t{SMALL_BEADS:.2f}\t{smallTotal:.2f}") 
print(f"Medium\t  {medium}\t\t {MEDIUM_BEADS:.2f}\t {mediumTotal:.2f}") 
print(f"Large\t  {large}\t\t {LARGE_BEADS:.2f}\t {largeTotal:.2f}") 
print(f"TOTAL\t\t\t\t{total:.2f}")
 


