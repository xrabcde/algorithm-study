import math

def solution(progresses, speeds):
    todo = []
    for i in range(len(progresses)):
        todo.append(math.ceil((100 - progresses[i]) / speeds[i]))

    answer = []
    while len(todo) > 0:
        tmp = todo.pop(0)
        cnt = 1
        for i in todo:
            if tmp < i:
                break
            cnt += 1
        answer.append(cnt)
        del todo[:cnt - 1]
    return answer