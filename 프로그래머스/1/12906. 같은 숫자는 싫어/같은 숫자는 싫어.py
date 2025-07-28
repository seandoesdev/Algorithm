def solution(arr):
    answer = []
    temp = "";
    for num in arr:
        if temp != num:
            answer.append(num)
            temp = num
    return answer