import sys
from typing import *

class MyHeap :
    @staticmethod
    def parent(i:int)->int:
        return (i-1)//2

    @staticmethod
    def left(i:int)->int:
        return i*2+1

    @staticmethod
    def rigth(i:int)->int:
        return (i+1)*2

    def __init__(self):
        self.q = []
        self.idxs = dict()

    def swap(self,idx1:int, idx2:int):
        tmp = self.q[idx1]
        self.idxs[tmp] = idx2
        self.q[idx1] = self.q[idx2]
        self.idxs[self.q[idx2]] = idx1
        self.q[idx2] = tmp

    def simple_push(self,v:int):
        self.idxs[v]=len(self.q)
        self.q.append(v)

    def simple_pop(self):
        del self.idxs[self.q[-1]]
        self.q.pop()

    def sift_up(self,idx:int):
        while(idx>0 and self.q[self.parent(idx)]>self.q[idx]):
            self.swap(idx,self.parent(idx))
            idx = self.parent(idx)

    def sift_down(self,idx:int):
        if self.rigth(idx)<len(n) and self.q[self.right(idx)]<self.q[idx] and self.q[self.right(idx)] < self.q[self.left(idx)] :
            self.swap(idx,right(idx))
            self.sift_down(right(idx))
        elif self.left(idx)<len(n) and self.q[self.left(idx)]<self.q[idx] and (self.right(idx)>=0 or self.q[self.left(idx)]<self.q[self.right(idx)] ) :
            self.swap(idx,self.left(idx))
            self.sift_down(left_idx)

    def insert(self,v:int):
        idx = len(self.q)
        self.simple_push(v)
        self.sift_up(idx)

    def remove(self,v:int):
        idx = self.idxs[v]
        self.swap(idx,len(self.q)-1)
        self.simple_pop()
        if self.q[idx]<self.q[self.parent(idx)]:
            self.sift_up(idx)
        elif (self.rigth(idx)<len(self.q) and self.q[idx]>self.q[right(idx)]) or (self.left(idx)<len(self.q) and self.q[idx]>self.q[left(idx)]):
            self.sift_down(idx)

    def print_min(self):
        print(self.q[0])
    
def solution(h:MyHeap,l:list[int]) :

    if 1==l[0] :
        h.insert(l[1])
    elif 2==l[0] :
        h.remove(l[1])
    elif 3==l[0]:
        h.print_min()


h = MyHeap()

lines = sys.stdin.readlines()

num_entries = int(lines[0])

for i in range(num_entries):
    solution(h,[int(i) for i in lines[i+1].strip().split()])
