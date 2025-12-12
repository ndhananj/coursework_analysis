import sys
import typing

def solution(adj:dict[set[int]], dist:list[int], start:int):
    level = 0
    node = start
    q = [node]
    dist[node-1] = 0
    while len(q)>0 :
        node = q.pop(0)
        for a in adj[node] :
            if -1 == dist[a-1]:
                dist[a-1] = dist[node-1] + 1
                q.append(a)


lines = sys.stdin.readlines()

num_tests = int(lines[0])

ln = 0
for t in range(num_tests):
    ln+=1
    nv, ne = [int(i) for i in lines[ln].strip().split()]
    
    adj = dict()
    dist = []
    for v in range(1,nv+1):
        adj[v] = set()
        dist.append(-1)
    
    for e in range(ne):
        ln+=1
        i , j = [int(p) for p in lines[ln].strip().split()]
        adj[i].add(j)
        adj[j].add(i)

    ln +=1
    start = int(lines[ln])

    solution(adj, dist, start)

    print(" ".join([str(p) for p in dist[1:]]))
