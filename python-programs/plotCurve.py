# import pandas in order to read csv file
import pandas as pd

data = pd.read_csv('CSEfaculty.csv')
print(data)

print('\n')
print(data['Name'])
print(data["Rank"])

