## [String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/?envType=problem-list-v2&envId=rab78cw1)

### 문제
- 주어진 스트링을 int 정수로 변환하는 문제.
  - 숫자나 +, - 등의 연산자가 나오지 않았을 때 공백이 처음에 나온다면 무시.
  - 맨 처음에 나오는 +, -는 부호를 결정. 따로 부호가 나오지 않았다면 기본 +.
  - 맨 앞에 나오는 0의 경우 무시. 숫자가 아닌 문자(non-digit)가 나온다면 그 전까지 나온 숫자 값을 반환.(공백이나, +, -의 경우 digit 사이에 나오면 그 전까지 나온 숫자 값을 반환.)
  - int 범위에서 오버플로우가 나면 Integer.MAX_VALUE를 반환. int 범위에서 언더플로우가 나면 Integer.MIN_VALUE를 반환.

### 해결
- 주어진 String을 반복문을 돌면서 주어진 조건을 만족하는지 체크하고, 그에 따라 int result를 반환.
- 반복문 1번(O(N))으로 해결.

### 복기
- 구현 문제로 예외처리 주의.
- 시간복잡도를 고혀해서 웬만해서 String 메소드 사용을 최소화 하려고 했음.(양옆 공백을 제거하는 trim 등은 사용하지 않음)
