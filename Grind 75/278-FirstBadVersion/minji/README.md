## [First Bad Version](https://leetcode.com/problems/first-bad-version/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
업다운 게임이다

### 해결
투포인터로 중간값을 검사하며 진행하여 해결했다.<br/>
center 계산과 탈출 조건을 잘 설정하지 않으면 Time Exceed가 뜨는 것에 주의해야 한다.

### 복기
center 계산에 자꾸 +1을 넣어서 무한 루프에 걸려서 시간초과가 떴다.<br/>
머리를 자꾸 안굴리고 해결하려고 하는 점을 개선해야할 것 같다.
