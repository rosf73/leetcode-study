## [Two Sum](https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
크기 2의 조합 중 원하는 값을 찾는 문제다.

### 해결
처음에는 지나간 수를 캐싱하며 map에서 읽어오는 방식을 구상했으나, 지식의 한계로 실패함.<br/>
일단 푸는 것에 목표로 두고, 지수 시간을 갖는 단순 조합 해결로 풀었다.<br/>
*n(n-1)/2, O(n^2)*

### 복기
처음 생각한 아이디어로 풀 수 있다. 대신 `HashMap`을 써서 key 값 조회의 시간 복잡도를 *O(1)* 로 줄여야한다.<br/>
그 경우 해결에 드는 평균 시간 복잡도는 *O(n)* 임
