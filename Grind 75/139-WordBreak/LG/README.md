## [Word Break](https://leetcode.com/problems/word-break/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
주어진 사전의 단어를 활용하여 제시된 단어를 만들수 있는가 판별하는 함수를 만드는 문제

### 해결
DP를 사용한 재귀함수를 구현하여 해결하였다.

### 복기
해결방법을 찾지못해 완전탐색에 가까운 방식을 구현함 <br/>
그 결과 코드의 성능이 매우 낮음.
개선을 하기위해 빠른코드를 찾아본결과 trie구조를 사용한경우가 많음 <br/>
차후에 trie를 공부하여 작성 예정
