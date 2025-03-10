import numpy as np

# Read input
N = int(input())  # Read matrix size

# Read matrices A and B
A = np.array([list(map(int, input().split())) for _ in range(N)])
B = np.array([list(map(int, input().split())) for _ in range(N)])

# Compute matrix multiplication (dot product)
result = np.dot(A, B)

# Print the result
print(result)
