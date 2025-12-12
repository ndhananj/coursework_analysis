import sys
from typing import *

def solution(money:int,n:int,prices:list[int]) -> (int,int) :
    paired = dict()
    for i in range(n):
        if prices[i] in paired.keys():
            return paired[prices[i]]+1, i+1
        else:
            paired[money-prices[i]]=i
    return None, None

lines = sys.stdin.readlines()

num_tests = int(lines[0])

for i in range(num_tests):
    money = int(lines[i*3+1])
    num_prices = int(lines[i*3+2])
    price_list = lines[(i+1)*3].strip()
    prices = [int(p) for p in price_list.split()]
    a,b = solution(money,num_prices,prices[:num_prices])
    print(f"{a} {b}")

