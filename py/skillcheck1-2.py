def solution(phone_number):
    plist = []
    plist = list(phone_number)
    for i in range(0, len(plist)-4):
        plist[i] = "*"
    answer = "".join(plist)
    return answer

input1 = "01033334444"
input2 = "027778888"

answer = solution(input1)
print(answer)
