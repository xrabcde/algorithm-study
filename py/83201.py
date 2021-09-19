def average(list):
    return sum(list)/len(list)

def score(list):
    avg = average(list)
    if avg >= 90:
        return 'A'
    if avg >= 80:
        return 'B'
    if avg >= 70:
        return 'C'
    if avg >= 50:
        return 'D'
    return 'F'

def solution(scores):
    result = []
    zip_scores = list(map(list, zip(*scores)))
    for i in range(len(zip_scores)):
        each = zip_scores[i]
        print(each)
        mine = each[i]
        print(mine)
        if min(each) == mine and each.count(min(each)) == 1:
            each.remove(mine)
        if max(each) == mine and each.count(max(each)) == 1:
            each.remove(mine)
        print(each)
        result.append(score(each))
    return "".join(result)
