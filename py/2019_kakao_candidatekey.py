from itertools import combinations

def isInUnique(index):
    for i in unique:
        count = 0
        for j in i:
            if j in index:
                count += 1
        if count == len(i):
            return True
    return False

def checkDuplicate(index, relation):
    if len(unique) != 0 and isInUnique(index):
        return False

    values = []
    for i in relation:
        eachValue = []
        for j in index:
            eachValue.append(i[j])
        values.append("".join(eachValue))
    return len(values) == len(set(values))

def solution(relation):
    answer = 0
    index = []

    global unique
    unique = []

    for i in range(len(relation[0])):
        index.append(i)

    combi = []
    for i in range(1, len(relation)):
        eachCombi = list(combinations(index, i))
        for j in eachCombi:
            combi.append(j)

    for i in combi:
        if checkDuplicate(i, relation):
            answer += 1
            unique.append(i)
    print(unique)

    return answer

if __name__ == '__main__':
    relation = [["100","ryan","music","2"],["200","apeach","math","2"],["300","tube","computer","3"],["400","con","computer","4"],["500","muzi","music","3"],["600","apeach","music","2"]]
    print(solution(relation))