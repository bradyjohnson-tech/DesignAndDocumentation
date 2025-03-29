import random

def guess():
    return random.randint(2, 5000)

def isPrime(x): # Big O X^2
    for i in range(x):
        for j in range(x):
            if i * j == x:
                return False
    return True

def findPrimes(num):
    primes = []
    for i in range(num):
        p = guess()
        while not isPrime(p):
            p = guess()
        primes += [p]
    return primes

# --------------Optimized --------------
def isPrimeOptimized(x): # Big O sqrt(X) Time
    if x < 2:
        return False
    for i in range(2, int(x ** 0.5) + 1):
        if x % i == 0:
            return False
    return True

def findPrimesOptimized(num):
    primes = []
    for i in range(num):
        p = guess()
        while not isPrimeOptimized(p):
            p = guess()
        primes += [p]
    return primes

import cProfile
cProfile.run('print(findPrimes(500)[:10])')
cProfile.run('print(findPrimesOptimized(500)[:10])')





