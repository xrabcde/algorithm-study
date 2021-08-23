from itertools import cycle

def solution(answers):
    win = []
    supo1 = [1, 2, 3, 4, 5]
    supo2 = [2, 1, 2, 3, 2, 4, 2, 5]
    supo3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    scores = [0, 0, 0]
    for s1, s2, s3, answer in zip(cycle(supo1), cycle(supo2), cycle(supo3), answers):
        if s1 == answer: scores[0] += 1
        if s2 == answer: scores[1] += 1
        if s3 == answer: scores[2] += 1

    for i, score in enumerate(scores):
        if score == max(scores):
            win.append(i + 1)
    return win