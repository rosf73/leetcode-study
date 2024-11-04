## [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
링크드 리스트 내의 순환을 찾는 문제이다.

### 해결
간단히 hash set visited 체크로 풀었다. 대신 메모리 효율이 안좋았음.<br/>
그래서 찾아보니, 플로이드 순환 찾기 알고리즘이 있댄다. 써보니 메모리를 3메가 정도 절약할 수 있다. 물론 릿코드 환경에 따라 다르겠지만...

### 복기
처음보는 알고리즘을 배웠다. 링크드 리스트 중앙값 찾기, 연속되는 연산으로 하나의 수에 도달하는 문제 등에서 주로 사용된다고 한다.<br/>
암기해두면 좋을 것 같다.
