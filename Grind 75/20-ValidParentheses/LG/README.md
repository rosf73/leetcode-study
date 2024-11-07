## [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/?envType=problem-list-v2&envId=rab78cw1)

### 문제
3가지의 괄호가 제대로 닫혀있는지 체크하는 함수를 구현하는 문제

### 해결
스택에 집어넣으며 확인을 하고, 시간을 더 줄이기 위해 닫는 괄호를 키로, 여는 괄호를 값으로 저장한 map을 사용하였다.

### 복기
스택으로 구현하면 원체 속도가 빨라서 map에 저장한것은 오히려 메모리만 더 잡아먹는 결과를 도출한것 같다. <br/>
괄호의 수가 더 많으면 이런 방식이 효율적일수도 있지만 3개정도로는 오히려 독이되는 것 같다.
