## [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
계단을 올라가는 방법의 가짓수를 구하는 문제.

### 해결
점화식을 세워서 해결하였다.
dp[i]=dp[i-1]+dp[i-2]

### 복기
점화식을 유추할 수 있다면 간단한 문제.<br/>
개수가 적으므로 재귀도 유효한 방법이 될 것 같음
