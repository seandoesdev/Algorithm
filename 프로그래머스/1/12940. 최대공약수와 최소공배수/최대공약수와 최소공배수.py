def solution(n, m):
    gcd = lambda a,b : b if not a%b else gcd(b, a%b)
    lcm = lambda a,b : a*b//gcd(a,b)
    return [gcd(n, m), lcm(n, m)]

'''
def solution(n, m):
    return [gcd(n, m),lcm(n, m)]

def lcm(a, b):
    return a * b / gcd(a, b);

def gcd(a, b):
    if (b == 0):
        return a
    return gcd(b, a % b);
'''