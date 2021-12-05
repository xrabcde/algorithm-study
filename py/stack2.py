def solution(priorities, location):
    index = 0
    size = len(priorities)
    while len(priorities) > 1:
        first = priorities.pop(0)
        if first >= max(priorities):
            if index%size == location:
                return size - len(priorities)
        else:
            priorities.append(first)
        index += 1
    return size

if __name__ == '__main__':
    priorities = [3, 1, 7, 5, 6, 3, 2, 1]
    location = 6
    print(solution(priorities, location))
