def solution(citations):
    answer = 0

    for i in range(len(citations)):
        answer += 1
        cnt = 0
        for n in citations:
            if answer <= n:
                cnt += 1
        if cnt < answer:
            answer -= 1
            break

    return answer
