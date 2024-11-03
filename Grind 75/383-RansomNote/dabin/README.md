## [Ransom Note](https://leetcode.com/problems/ransom-note/description/?envType=problem-list-v2&envId=rab78cw1)

### 문제
- 주어진 두 스트링(ransomNote, magazine)에서, magazine에 속한 Character들로 ransomNote의 String 값을 만들 수 있다면 true를 반환하고, 그렇지 않다면 false를 반환하는 문제.

### 해결
- ransomNote, magazine의 length를 가져와서 비교한 뒤, 둘 중 더 높은 값을 가진 length를 기준으로 반복문을 1번 돌면서, ransomNote에 존재하는 소문자 알파벳들을 카운팅하고, 동시에 magazine에 존재하는 소문자 알파벳 중 ransomNote에 존재하는 값이 있는지 체크.
- 만약 ransomNote가 가진 알파벳을 magazine에서 모두 갖고있다면 true 반환.
- 단순 구현 문제로, 반복문 1번(O(N))으로 해결.

### 복기
- 구현 문제인 만큼 시간 복잡도를 고려하면서 풀 때 예외 처리에 유의.
