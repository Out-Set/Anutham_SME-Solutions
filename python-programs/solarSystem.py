mercury = {'planet_no':1, 'water':False, 'life':False, 'population':0}
venus = {'planet_no':2, 'water':False, 'life':False, 'population':0}
earth = {'planet_no':3, 'water':True, 'life':True, 'population':7.44e12}
mars = {'planet_no':4, 'water':False, 'life':False, 'population':0}
jupiter = {'planet_no':5, 'water':False, 'life':False, 'population':0}
saturn = {'planet_no':6, 'water':False, 'life':False, 'population':0}
uranus = {'planet_no':7, 'water':False, 'life':False, 'population':0}
neptun = {'planet_no':8, 'water':False, 'life':False, 'population':0}

solar_system = [mercury, venus, earth, mars, jupiter, saturn, uranus, neptun]

# option-1, will retuen true
# if result is true, there is water on earth else not
res = solar_system[2]['water']
print('option-1 result: ', res)

# option-2, will retuen false, because earth is at 2nd index not 3rd in solar_system
res = solar_system[3]['water']
print('option-2 result: ', res)

# option-3, it will cause an error, because list indices must be integers or slices, not str
#res = solar_system['earth']['water']
#print('option-3 result: ', res)

# option-4, it will also cause an error, due to key error
#res = solar_system[2][1]
#print('option-4 result: ', res)

