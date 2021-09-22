from itertools import combinations

def isPrime(num):
    for i in range(2, num):
        if num%i == 0:
            return False
    return True

def solution(nums):
    answer = 0
    result = [sum(c) for c in combinations(nums,3)]
    for i in result:
        if isPrime(i):
            answer += 1
    return answer
