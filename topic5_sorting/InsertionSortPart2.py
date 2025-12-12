import sys
from typing import *

def solution(n:int,a:list[int]):
    for i in range(1,n):
        j=0
        while a[j]<a[i]:
            j+=1
        if j != i:
            e = a.pop(i)
            a.insert(j,e)
        print(" ".join([str(e) for e in a]))

lines = sys.stdin.readlines()

size = int(lines[0])

data = lines[1].strip()
arr = [int(i) for i in data.split()]
solution(size,arr[:size])


