def total(n):
    result = 0
    for i in range(1, n+1):
        if n % i == 0:
            result += i
    return result

def solution(n):
    return total(n)