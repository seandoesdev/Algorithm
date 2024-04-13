def solution(a, b):
    if a > b:
        tmp = b
        b = a
        a = tmp
    return sum([i for i in range(a, b+1)])