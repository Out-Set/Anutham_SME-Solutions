def write_olympics(file, data):
    with open(file,'w') as f:
        for line in data:
            type_sw,numeral,city,country,year=line
            f.write(f"{year} {type_sw} Olympics {numeral}, {city}, {country}\n")


games = [("Summer", "I", "Athens", "Greece", 1896), 
         ("Winter", "I", "Chamonix", "France", 1924)]

write_olympics("Test.txt", games)

with open("Test.txt") as f:
    print(f.read())

