## [Ransom Note](https://leetcode.com/problems/ransom-note/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
문자열의 구성요소를 활용해 주어진 문자열을 구성할수 있는지를 판단하는 문제

### 해결
해시를 사용해 순회하며 판별하는 식으로 풀이함<br/>
해시를 사용하지 않아도 풀이 방식은 비슷했을듯 함

### 복기
속도가 생각보다 느리다. <br/>
해시가 필요없었고, 오히려 불필요한 연산만 늘렸다.<br/>
체크해야할 개수가 26개 뿐이어서 배열로 하는것이 더 빠르고 효율이 잘나온다.
