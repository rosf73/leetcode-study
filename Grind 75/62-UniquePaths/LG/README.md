## [Unique Paths](https://leetcode.com/problems/unique-paths/?envType=problem-list-v2&envId=rab78cw1)

### 문제
주어진 2차원 배열에서 좌측 상단에서 우측 하단으로 진행할수 있는 경로의 수 를 반환하는 문제

### 해결
dp를 사용해 해결하였다.<br/>
점화식은 dp[i][j]=dp[i-1][j]+dp[i][j−1]

### 복기
dp의 기본적인 문제중 하나<br/>
점화식을 유추할수 있다면 간단한 문제
