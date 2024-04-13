def solution(absolutes, signs):
    return sum([v if signs[k] else v * -1 for k, v in enumerate(absolutes)])
