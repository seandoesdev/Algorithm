def solution(s):
    center = int(len(s)/2)
    if not len(s) % 2:
        return s[center-1:center+1]
    return s[center]