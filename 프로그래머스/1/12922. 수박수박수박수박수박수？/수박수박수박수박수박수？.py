def solution(n):
    cnt = int(n / 2)
    if not n % 2:
        return "수박" * cnt
    return ("수박" * cnt) + "수"