def solution(record):
    dict = {}
    for i in record:
        each = i.split()
        uid = each.pop(1)
        if uid not in dict:
            each.reverse()
            dict[uid] = each
        else:
            if len(each) == 1:
                dict[uid] = dict.get(uid) + each
            else:
                dict.get(uid)[0] = each.pop()
                dict[uid] = dict.get(uid) + each

    answer = []

    for i in record:
        each = i.split()
        name = dict.get(each[1])[0]
        action = dict.get(each[1]).pop(1)
        if action == "Enter":
            answer.append(name + "님이 들어왔습니다.")
        elif action == "Leave":
            answer.append(name + "님이 나갔습니다.")

    return answer
