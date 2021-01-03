import math

def solution(w,h):
    origin = w*h
    cutted = w+h-math.gcd(w,h)
    answer = origin - cutted
    return answer

w = 8
h = 12
print(solution(w, h))
