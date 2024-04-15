def solution(s):
    number = ['zero', 'one', 'two', 'three', 'four', 
             'five', 'six', 'seven', 'eight', 'nine']
    
    for i in range(len(number)):
        s_list = s.split(number[i])
        s = f'{i}'.join(s_list)
    
    return int(s)