def solution(msg):
    dic = dict()
    list = []
    [list.append(chr(i)) for i in range(ord('A'), ord('Z')+1)]
    for index, char in enumerate(list):
        dic[char] = index+1
    index = 0
    maxIndex = 26
    length = 0
    answer = []
    while True:
        length += 1
        if not msg[index:index+length] in dic:
            answer.append(dic[msg[index:index+length-1]])
            maxIndex += 1
            dic[msg[index:index+length]] = maxIndex
            index += length-1
            length = 0
        else:
            if index+length-1 == len(msg):
                answer.append(dic[msg[index:index+length-1]])
                break
    return answer

msg = "KAKAO"
print(solution(msg))
