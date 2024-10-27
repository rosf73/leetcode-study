## [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
- 문자열 안에서 글자가 중복되지 않는 가장 긴 Substring을 찾는 문제 

### 해결
- String의 문자열에 존재하는 character들을 반복문을 돌면서 탐색.
- 이미 한 번 나왔던 character인지 체크하고 만약 나왔던 character라면 현재 체크하는 index의 이전 값(index - 1)에서 이전까지 마지막에 나왔던 character 인덱스를 뺀 값을 구한다. (== subString의 최대 문자열 길이)
- 이전까지 나왔던 substring의 최대 길이들과 비교해서 가장 큰 값을 max 값으로 변경한다.
- 반복문을 다 돌고 나온 max 값을 반환한다.
- 반복문 1번(O(N))으로 해결.

### 복기
- 반복문이나 자료구조 사용을 최소화 하여 시간 복잡도 개선을 많이 할 수 있었음.
- 반례 케이스 예외처리에 유의.
