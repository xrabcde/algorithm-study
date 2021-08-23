def solution(brown, yellow):
    add = (int)((brown + 4) / 2)
    sub = brown + yellow
    answer = []

    for i in range(add):
        if i * (add - i) == sub:
            answer.append(i)
            answer.append(add - i)
            break

    answer.sort(reverse=True)
    return answer