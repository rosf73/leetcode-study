## [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
- 주어진 문자열에서 가장 긴 팰린드롬 substring을 찾는 문제.

### 해결
- DP로 완전 탐색을 통해 해결.
- 맨 앞 char ~ 맨 뒤 char부터 순차적으로 DP를 통해 서로가 쌍을 이루는 지 확인하고, 탐색이 진행된 start - end 사이에 팰린드롬 스트링이 존재한다면 해당 팰른 드롬 스트링 길이 값들을 비교 연산.
- 메모이제이션 통해 불필요한 반복 연산 제거.

### 복기
- DP를 통해 풀었는데 생각보다 시간 복잡도가 낮게 측정되어, 리트코드 기준 시간 복잡도가 더 낮게 측정되는 투 포인터 방식에 도전해보면 좋을 것 같음.
