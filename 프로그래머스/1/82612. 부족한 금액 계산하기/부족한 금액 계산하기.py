def solution(price, money, count):
    payment = price * (count * (1 + count)/2)
    if payment < money:
        return 0
    else:
        return int(payment - money)
        