## [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
배열을 두 부분으로 나누었을때 둘의 합 이 같은지 확인하는 문제.

### 해결
dp를 이용해 부분합을 모두 저장해가면서 원하는 값이 나오는지 찾음.

### 복기
처음에는 2차원배열로 dp를 진행하였는데 속도가 느려 최적화를 고민하다 1차원배열로 전환하였다 <br/>
1차원배열로 진행할시 중복된 값이 저장될 가능성이 있는데 이를 막기위해 역방향으로 진행하였다.
