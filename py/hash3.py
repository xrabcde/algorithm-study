def solution(clothes):
    countByTypes = {}

    for i in clothes:
        if i[1] in countByTypes:
            countByTypes[i[1]] += 1
        else:
            countByTypes[i[1]] = 1

    cnt = 1

    for i in countByTypes.values():
        cnt *= (i+1)

    return cnt - 1

# Counter와 reduce 활용한 풀이
def solution(clothes):
    from collections import Counter
    from functools import reduce

    cnt = Counter([kind for name, kind in clothes])
    answer = reduce(lambda x, y: x*(y+1), cnt.values(), 1) - 1

    return answer
