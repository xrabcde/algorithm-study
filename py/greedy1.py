def solution(n, lost, reserve):
    answer = n - len(lost)
    lost.sort()
    for i in range(1, n+1):
        if i in lost:
            if i in reserve:
                reserve.remove(i)
                lost.remove(i)
                answer += 1
    for i in lost:
        if i-1 in reserve:
            reserve.remove(i-1)
            answer += 1
            continue
        if i+1 in reserve:
            reserve.remove(i+1)
            answer += 1

    return answer
