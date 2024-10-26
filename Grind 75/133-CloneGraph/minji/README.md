## [Clone Graph](https://leetcode.com/problems/clone-graph/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
Node 객체로 이루어진 그래프 내의 모든 인스턴스를 새로 만들어 반환하는 문제다.

### 해결
그래프를 타고 들어가 인스턴스만 새로 만들고, 캐싱하여 재활용할 수 있도록 구현했다.<br/>
Input이 인접리스트의 형태로, 바로 단순한 dfs가 떠올랐다. *O(N+E)*

### 복기
함수를 조회하는지 자체도 시간 효율에 영향을 미친다.<br/>
함수 탈출 조건문을 외부에 넣어서 `Beats 96.59%`를 달성했다.
