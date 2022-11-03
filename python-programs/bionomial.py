def binomial(n, k):
    p = 1    
    for i in range(1, min(k, n - k) + 1):
        p *= n
        p //= i
        n -= 1
    return p

print(binomial(4, 2))
print(binomial(0, 0))
print(binomial(0, 2))
print(binomial(2, 0))

