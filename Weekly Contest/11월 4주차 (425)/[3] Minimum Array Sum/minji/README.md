### 문제
제한된 횟수로 주어진 두 종류의 operation을 이용해 만들 수 있는 가장 작은 list sum을 찾는 문제이다.

### 해결
desc 순으로 정렬된 `nums`에서 조건식에따라 operation을 차감하는 방식으로 구현했다. *O(n)*

### 복기
일단 풀자는 생각으로 조건식을 너무 복잡하게 구성했더니, 예외가 발생할 때마다 수정하기가 너무 힘들었다.<br/>
추후 개선을 시도해봤는데, 손이 너무 많이가고, 제한시간 내에 해결할 수 없는 구조이므로 폐기했다.<br/>
3중 dp로 모든 경우의 수를 탐색하여 해결했다.
