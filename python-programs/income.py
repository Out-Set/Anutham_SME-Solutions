import itertools


lst = [['apple','banana','iot', 'OW1'], ['Z', 'AH1', 'R']]

def count_vowels(lst):
    data = itertools.chain.from_iterable(data) # data is first arg
    return sum(1 for i in data if any(j in i for j in 'aeiouAEIOU'))

print(count_vowels(lst))
