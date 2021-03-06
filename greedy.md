# Greedy Algorithm

- 탐욕적 알고리즘(욕심쟁이 알고리즘)
- 최적해를 구하는 데에 사용되는 근사적인 방법으로, 여러 경우 중 하나를 결정해야 할 때마다 그 순간에 최적이라고 생각되는 것을 선택해 나가는 방식
- 순간마다 하는 선택은 그 순간에 대해 지역적으로는 최적이지만, 최종적인 해답이 최적이라는 보장은 없다.
- 최적의 해는 아니지만, 최악의 해도 아니다.
- 여기서 구해진 해는 Backtracking, Branch and Bound방식에서 사용될 수 있다.
- 적용 가능한 곳
  - Minimum Spanning Tree를 구하는 **Prime Alogrithm**, **Kruskal Algorithm**, 가중치가 있는 방향 그래프에서 최단거리를 구해주는 **Dijkstra Algorithm**, **거스름돈 나누기** 등이 있다.
- 탐욕 알고리즘이 잘 작동하는 문제는 탐욕스런 선택 조건과 최적 부분 구조 조건이라는 두 가지 조건이 만족된다. 
  - **탐욕스런 선택 조건** : 앞의 선택이 이후의 선택에 영향을 주지 않는다
  - **최적 부분 구조 조건** : 문제에 대한 최적해가 부분문제에 대해서도 최적해이다 
- 이러한 조건이 성립하지 않으면 최적해를 구하지 못함
- 하지만 근사 알고리즘으로 사용이 가능할 수 있으며, 계산 속도가 빨라 실용적으로 사용할 수 있다.
- **매트로이드** : 탐욕 알고리즘이 언제나 최적해를 찾아낼 수 있다
