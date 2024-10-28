## [Two Sum](https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
- 주어진 배열(nums[])에서 두 값을 찾아 더했을 때 target 값을 만족하는 값들의 인덱스를 저장한 배열을 반환하는 문제.

### 해결
- 주어진 배열(nums[])을 반복문을 돌면서 target 값에서 뺀 값을 해시맵에 저장하고, 해당 해시맵에 특정 값과 더했을 때 target 값을 만족하면서도, index가 겹치지 않는 값이 존재한다면, 해당 값들을 결과로 반환.
- 해시맵 써서 반복문 1번(O(N))으로 해결.

### 복기
- 다른 문제를 풀 때도 시간 복잡도 개선을 위해 다양한 시도 필요.