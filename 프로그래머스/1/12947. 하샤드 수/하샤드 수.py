def solution(x):
    return True if (not x % digit_sum(list(str(x)))) else False


def digit_sum(n_list):
    return sum(map(int, n_list))