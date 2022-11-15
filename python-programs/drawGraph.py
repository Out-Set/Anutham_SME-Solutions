# import matplotlib
import matplotlib.pyplot as plt

#import numpy
import numpy as np

x = np.linspace(-5,5,100)

# label: Used to add label
# color: Used to set color
# linestyle: Used to set the line-style
plt.plot(x, 3*x**3-26*x+10, '-r', label='3*x**3-26*x+10', color='blue', linestyle='solid')
plt.plot(x, 9*x**2-26, '-.g', label='9*x**2-26', color='red', linestyle='dashdot')
plt.plot(x, 18*x,':b', label='18*x', color='green', linestyle='dotted')

plt.legend(loc='upper left')
plt.title('matplotlib graph drawing')
plt.show()

