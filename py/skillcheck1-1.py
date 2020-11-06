def solution(s) :
    if len(s) == 4 or len(s) == 6 :
        answer = s.isnumeric()
    else :
        answer = False
    return answer

input1 = "a234"
input2 = "1234"
answer = solution(input1)
print(answer)
