bank1 = {'c': 3, 'm': 3}
bank2 = {'c': 0, 'm': 0}
boat = {'c': 0, 'm': 0}

#Function to print the conditions
def print_cond(dct1, dct2, dct3):
    msg = """
    Bank 1: {} cannibal(s), {} missionaries
    Bank 2: {} cannibal(s), {} missionaries
    Boat: {} cannibal(s), {} missionaries
    """
    print(msg.format(dct1['c'], dct1['m'], dct2['c'], dct2['m'], dct3['c'], dct3['m']))

#Fuction to check for all possible ways
def cann_miss(b1 = bank1, b2 = bank2, bo = boat):
    if all(x == 0 for x in b2.values()):  # bank2 is empty
        print_cond(b1, b2, bo)
        b1['c'] -= 1  # 1st cannibal leaves bank1
        bo['c'] += 1  # ... goes on board
    b1['m'] -= 1  # 1st missionary leaves bank1
    bo['m'] += 1  # ... goes on board
    print_cond(b1, b2, bo)
    if all(x == 0 for x in b1.values()):  # bank1 is empty
        bo['c'], bo['m'] = 0, 0  # 1 cannibal and 1 missionary go out of boat
        b2['c'] += 1  # 1st cannibal steps out on bank-2
        b2['m'] += 1  # 1st missionary steps out on bank-2
        print_cond(b1, b2, bo)
        return  # final condition is met

    bo['m'] -= 1  # 1 missionary goes out of boat
    b2['m'] += 1  # ... steps out on bank2
    print_cond(b1, b2, bo)
    b1['c'] -= 1  # 1 cannibal leaves bank1
    bo['c'] += 1  # ... goes on board
    print_cond(b1, b2, bo)
    bo['c'] -= 1  # 1 cannibal goes out of boat
    b2['c'] += 1  # ... steps out on bank2
    print_cond(b1, b2, bo)
    cann_miss(b1, b2, bo)  # another series of crossings    
cann_miss()         # calling method from main