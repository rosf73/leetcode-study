## [Combination Sum](https://leetcode.com/problems/combination-sum/?envType=problem-list-v2&envId=rab78cw1)

### 문제
주어진 정수를 주어진 배열의 원소의 합이 가능한 조합을 모두 찾는 문제.

### 해결
배열을 정렬한 후 백트래킹으로 모든조합을 확인하는 방식으로 진행했다.<br/>
시간을 줄이기 위해 타겟보다 크기가 커질경우 다음으로 넘어가게 만들었다.

### 복기
숫자를 중복으로 사용가능한 점만 잘 해결하면 일반적인 백트래킹문제이다.
