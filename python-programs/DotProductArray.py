import numpy as np

X = np.ones((5, 5))
w = np.arange(5).reshape(1, -1)
print(f"X shape: {X.shape}")
print(f"w shape: {w.shape}")


# TODO 13.1
print("\nDot product between X and w: ")
# we will have to take w first then X, according to array's product rule.
dotted_array = np.dot(w, X)
print(dotted_array, "\n")
print(f"dotted_array output: \n {dotted_array}")
print(f"dotted_array shape: {dotted_array.shape}")

