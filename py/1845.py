def solution(nums):
    goal = len(nums)/2
    setIndex = len(list(set(nums)))
    return min(setIndex, goal)
