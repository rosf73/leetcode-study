## [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
linkedList를 merge sort하는 문제이다.

### 해결
조금 복잡하게 생각했다. 투포인터로 풀었다. 시간은 빠르지만 변수로 저장할 게 많아져서 메모리 효율이 좀 떨어졌다.

### 복기
다른 사람들 풀이보니 재귀로 엄청 단순하게 풀었다. 앞서 계산한 값은 후에 필요없고, 레퍼런스를 반환하는 로직이라 divide and conquer로 해결한다고 생각한 것 같다.<br/>
함수 조회에 비용이 들기때문에 재귀가 효율이 많이 떨어진다 생각했는데, n의 크기가 최대 100이라 차이가 없는 것 같다.<br/>
n의 크기가 많이 커지면 성능이 괜찮을까? 궁금하다.
