import csv
import pandas as pd
import numpy as np
technologies = {'Courses' : ["Spark","PySpark","Hadoop","Python","java","JDBC","SQL","C#","CPP","JavaScript"],
                'Fee' : [22000,25000,np.nan,24000,5300,5600,5200,8963,5633,7866],
                'Duration' : ['30day',None,'55days',np.nan,'2 day',None,np.nan,'45 day','6 day',None],
                'Discount' : [1000,2300,1000,np.nan,4500,520,896,654,965,895]
             }

with open("courses.csv", 'w', newline='') as f:
    writer = csv.writer(f)
    for row in technologies.items():
        writer.writerow(row)

df = pd.read_csv("courses.csv")
print(df)

