def binomial(n,k):
    if k==0 : return 1

    numerator =1
    denominator=1
    for i in range(n,n-k,-1):numerator*=i
    for i in range(1,k+1):denominator*=i

    return numerator//denominator

for i in range(1,21):
    for j in range(i,-1,-1):print(binomial(i,j),end=' ' )
    print()

toss = 100
heads = 60

print('Probability: {}'.format(binomial(toss,heads)/(2**100)))

probability = 0
for heads in range(60,101):
    probability+= binomial(toss,heads)/(2**100)
print('Probability: {}'.format(probability))

