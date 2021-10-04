def sum(x) :
    strx = str(x)
    result = 0
    for i in range(len(strx)):
        result += int(strx[i])
    return result

def solution(n):
    return sum(n)
