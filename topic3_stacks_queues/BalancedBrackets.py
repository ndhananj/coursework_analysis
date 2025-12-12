import sys
from typing import *

def solution(s:str) -> str :
    o = {'{','[','('}
    c2o = {'}':'{',']':'[',')':'('}
    
    stack = []

    for i in range(len(s)):
        if(s[i] in o):
            stack.append(s[i])
        elif(c2o[s[i]]==stack[-1]):
            stack.pop()
        else:
            return 'NO'

    return 'YES'

lines = sys.stdin.readlines()

num_entries = int(lines[0])

for i in range(num_entries):
    print(solution(lines[i+1].strip()))
