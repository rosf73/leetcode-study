## [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
주어진 문자열을 분해해서 가장긴 회문의 길이를 반환하는문제

### 해결
회문에는 최소 두개씩 짝지어져 들어가야 하기때문에 짝수의 알파벳을 센 후 홀수개의 알파벳이 존재할시 중앙에 넣는 방식으로 계산하였다.

### 복기
처음에는 문자열을 만들어서 길이를 재려고 했으나, 그럴 필요가 없다는 것을 깨달은 후에는 쉽게 해결하였다.<br/>
이 코드에서는 맵을 사용했지만 길이 52짜리 배열을 사용하는게 더 효율적일듯.
