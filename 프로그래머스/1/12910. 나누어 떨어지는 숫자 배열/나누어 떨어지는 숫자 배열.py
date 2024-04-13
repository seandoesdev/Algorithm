def solution(arr, divisor):
    answer = []
    
    for i in sorted(arr):
        if not i % divisor:
            answer.append(i)
            
    if not answer:
        answer.append(-1)
        
    return answer