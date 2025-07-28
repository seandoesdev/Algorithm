def solution(s):
    s_list = list(s.split(' '))
    answer = []
    
    for word in s_list:
        tmp = ""
        
        for idx in range(len(word)):
            if not idx % 2:
                tmp += word[idx].upper()
            else:
                tmp += word[idx].lower()
                
        answer.append(tmp)
    return ' '.join(answer)
    