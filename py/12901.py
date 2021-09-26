from datetime import datetime

def solution(a, b):
    list = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
    return list[datetime(2016, a, b).weekday()]
