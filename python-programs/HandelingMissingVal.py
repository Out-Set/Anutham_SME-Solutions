# importing pandas as pd
import pandas as pd

# importing numpy as np
import numpy as np

# dictionary of lists
dict = {'A':[100, 90, np.nan, 95],
		'B': [30, 45, 56, np.nan],
		'C':[np.nan, 40, 80, 98]}

# creating a dataframe from dictionary
df = pd.DataFrame(dict)
# printing dataframe having missing values
print(df)

print("\n\n")

# filling missing value using fillna()
df = df.fillna(0)
# printing dataframe after filling missing values
print(df)

