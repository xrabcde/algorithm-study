from itertools import permutations

def isPrime(n):
    if n == 1 or n == 0:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def solution(numbers):
    number = []
    for i in str(numbers):
        number.append(i)

    permu = []
    for i in range(1, len(numbers) + 1):
        each = list(map(''.join, permutations(number, i)))
        for n in each:
            permu.append(int(n))
    permu = list(set(permu))

    answer = 0
    for i in permu:
        if isPrime(i): answer += 1

    return answer