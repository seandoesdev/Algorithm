from itertools import combinations

def solution(number):
    answer = 0
    
    for i in combinations(number, 3):
        if not sum(i):
            answer += 1
    return answer